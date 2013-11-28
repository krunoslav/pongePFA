package hr.ponge.pfa.service.core.picture;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.Picture;
import hr.ponge.pfa.model.User;
import hr.ponge.pfa.service.BussinesLogic;
import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.BusinessLogicMethod;
import hr.ponge.util.HibernateUtil;
import hr.ponge.util.ParamSelect;
import hr.ponge.util.PfaSingleton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.axiom.attachments.utils.IOUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.hibernate.Query;

public class PictureBL extends BussinesLogic {

	private static final Logger log = Logger.getLogger(PictureBL.class);

	@BusinessLogicMethod
	public void readPicture(ReadPictureReqDTO req, ReadPictureRespDTO resp)
			throws PfaException {

		validateReadRequset(req, resp);
		if (resp.getErrors_() != null && resp.getErrors_().length > 0) {
			return;
		}

		HibernateUtil hb = new HibernateUtil();
		ParamSelect ps = new ParamSelect();
		String sel = "Select p from Picture p "
				+ " inner join fetch p.user as u"
				+ " inner join fetch u.tenant as t " + " where p.id != 0 ";

		if (req.isIdSpecified()) {
			sel = sel + " and p.id=:id ";
			ps.addParametar("id", req.getId());
		}
		if (req.isTenantIdSpecified()) {
			sel = sel + " and t.id=:tId ";
			ps.addParametar("tId", req.getTenantId());
		}
		if (req.isUserIdSpecified()) {
			sel = sel + " and u.id=:uId ";
			ps.addParametar("uId", req.getUserId());
		}
		if (req.isLimitsSpecified_()) {
			ps.setFirstRow(req.getLimits_().getFirstRecord());
			ps.setMaxRows(req.getLimits_().getMaxRecords());
		}
		boolean pullPic = true;
		if (req.isPullPictureSpecified()) {
			pullPic = req.getPullPicture();
		}
		Query query = hb.getSession().createQuery(sel);
		ps.processQuery(query);
		List<Picture> l = query.list();
		for (Picture p : l) {
			resp.addPictures_(convertPictureToPictureDTO(p, pullPic));
		}

	}

	private void validateReadRequset(ReadPictureReqDTO req,
			ReadPictureRespDTO resp) {

	}

	@BusinessLogicMethod
	public void createPicture(CreatePictureReqDTO req, CreatePictureRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getPicture_(), errors, hb, true, null);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			Picture pic = new Picture();

			PictureDTO dto = req.getPicture_();

			pic.setCreationDate(new Date());
			pic.setLastChangeDate(new Date());
			pic.setMd5Code(dto.getMd5Code());
			pic.setPicByteSize(dto.getPicByteSize());
			pic.setUser((User) hb.getSession().get(User.class, dto.getUserId()));
			pic.setxSize(dto.getXsize());
			pic.setySize(dto.getYsize());

			byte[] data = IOUtils.getStreamAsByteArray(dto.getPicture()
					.getInputStream());
			pic.setPicture(data);
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(pic);
			PictureDTO ret = convertPictureToPictureDTO(pic, false);
			resp.setPicture_(ret);
			if (myTransaction) {
				hb.commitTransaction();
			}
		} catch (PfaException e) {
			hb.rollbackTransaction();
			throw e;
		} catch (Exception e) {
			hb.rollbackTransaction();
			PfaException ex = new PfaException(PfaException.GENERAL_ERROR,
					e.getMessage(), e);
			throw ex;
		}

	}

	private void validateCreateUpdate(PictureDTO dto, List<ErrorType> errors,
			HibernateUtil hb, boolean create, Object object)
			throws PfaException {
		if (dto.isMd5CodeSpecified()) {
			if (!dto.getMd5Code().toUpperCase().matches("[a-fA-F0-9]{32}")) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"md5WorngFormat", new String[] { dto.getMd5Code() }));
			}
		} else {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "Md5Code" }));
		}

		if (dto.isPicByteSizeSpecified()) {
			// test picture size
		} else {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "PicByteSize" }));
		}
		if (!dto.isPictureSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "Picture" }));
		}
		if (dto.isUserIdSpecified()) {
			List l = hb
					.getSession()
					.createQuery(
							"Select u.id from User u where u.id="
									+ dto.getUserId()).list();
			if (l.size() != 1) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"noUserFoundWithId", new String[] { dto.getUserId()
								+ "" }));
			}
		} else {
			if (create) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "UserId" }));
			}
		}
		if (!dto.isXsizeSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "Xsize" }));
		}
		if (!dto.isYsizeSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "Ysize" }));
		}

		if (dto.isMd5CodeSpecified() && dto.isPictureSpecified()) {
			String md5 = dto.getMd5Code();
			String picMd = "";
			DataHandler dh = dto.getPicture();
			try {
				byte[] data = IOUtils.getStreamAsByteArray(dh.getInputStream());
				picMd = DigestUtils.md5Hex(data);

				if (!md5.equalsIgnoreCase(picMd)) {
					errors.add(createError(
							PfaException.REQUEST_VALIDATION_ERROR,
							"md5DoesNotMatchPicture",
							new String[] { md5, picMd }));
				}

			} catch (IOException e) {
				throw new PfaException(PfaException.REQUEST_VALIDATION_ERROR,
						e.getMessage(), e);
			}
		}

	}

	@BusinessLogicMethod
	public void updatePicture(UpdatePictureReqDTO req, UpdatePictureRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getPicture_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));

				return;
			}

			Picture picture = (Picture) hb.getSession().get(Picture.class,
					req.getPicture_().getId());
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getPicture_(), errors, hb, false, picture);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			PictureDTO dto = req.getPicture_();
			if (dto.isMd5CodeSpecified()) {
				picture.setMd5Code(dto.getMd5Code());
			}
			if (dto.isPicByteSizeSpecified())
				picture.setPicByteSize(dto.getPicByteSize());
			;

			picture.setLastChangeDate(new Date());
			if (dto.isPictureSpecified()) {
				byte[] data = IOUtils.getStreamAsByteArray(dto.getPicture()
						.getInputStream());
				picture.setPicture(data);
			}
			if (dto.isUserIdSpecified()) {
				picture.setUser((User) hb.getSession().get(User.class,
						dto.getUserId()));
			}
			if (dto.isXsizeSpecified()) {
				picture.setxSize(dto.getXsize());
			}
			if (dto.isYsizeSpecified()) {
				picture.setySize(dto.getYsize());
			}

			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(picture);
			resp.setPicture_(convertPictureToPictureDTO(picture, false));
			if (myTransaction) {
				hb.commitTransaction();
			}
		} catch (PfaException e) {
			hb.rollbackTransaction();
			throw e;
		} catch (Exception e) {
			hb.rollbackTransaction();
			PfaException ex = new PfaException(PfaException.GENERAL_ERROR,
					e.getMessage(), e);
			throw ex;
		}

	}

	@BusinessLogicMethod
	public void deletePicture(DeletePictureReqDTO req, DeletePictureRespDTO resp)
			throws PfaException {
		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getPicture_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));
				return;
			}
			Picture pic = (Picture) hb.getSession().get(Picture.class,
					req.getPicture_().getId());
			boolean myTran = hb.beginTransaction();

			hb.getSession().delete(pic);
			hb.getSession().flush();
			if (myTran) {
				hb.commitTransaction();
			}

		} catch (PfaException e) {
			hb.rollbackTransaction();
			throw e;

		} catch (org.hibernate.exception.ConstraintViolationException e) {
			log.error(e.getMessage(), e);
			hb.rollbackTransaction();
			resp.addErrors_(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"entityCannotBeDeletedItIsUsedByOtherEntities",
					new String[] {}));

		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			hb.rollbackTransaction();

			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}

	}

	public static PictureDTO convertPictureToPictureDTO(Picture picture,
			boolean pullPicture) {
		PictureDTO dto = PfaSingleton.getReference().createObject(
				PictureDTO.class);
		dto.setId(picture.getId());
		dto.setMd5Code(picture.getMd5Code());
		dto.setPicByteSize(picture.getPicByteSize());
		dto.setUserId(picture.getUser().getId());
		dto.setXsize(picture.getxSize());
		dto.setYsize(picture.getySize());
		if (pullPicture) {
			ByteArrayDataSource rawData = new ByteArrayDataSource(
					picture.getPicture());
			DataHandler data = new DataHandler(rawData);
			dto.setPicture(data);
		}

		return dto;
	}
}
