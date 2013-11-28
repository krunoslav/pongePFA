package hr.ponge.pfa.service.core.pictureTmpl;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.TemplatePicture;
import hr.ponge.pfa.model.Tenant;
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

public class PictureTmplBL extends BussinesLogic {

	private static final Logger log = Logger.getLogger(PictureTmplBL.class);

	@BusinessLogicMethod
	public void readPictureTmpl(ReadPictureTmplReqDTO req,
			ReadPictureTmplRespDTO resp) throws PfaException {

		validateReadRequset(req, resp);
		if (resp.getErrors_() != null && resp.getErrors_().length > 0) {
			return;
		}

		HibernateUtil hb = new HibernateUtil();
		ParamSelect ps = new ParamSelect();
		String sel = "Select p from TemplatePicture p "
				+ " inner join fetch p.tenant as t " + " where p.id != 0 ";

		if (req.isIdSpecified()) {
			sel = sel + " and p.id=:id ";
			ps.addParametar("id", req.getId());
		}
		if (req.isTenantIdSpecified()) {
			sel = sel + " and t.id=:tId ";
			ps.addParametar("tId", req.getTenantId());
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
		List<TemplatePicture> l = query.list();
		for (TemplatePicture p : l) {
			resp.addPictureTemplates_(convertPictureTmplToPictureDTO(p, pullPic));
		}

	}

	private void validateReadRequset(ReadPictureTmplReqDTO req,
			ReadPictureTmplRespDTO resp) {

	}

	@BusinessLogicMethod
	public void createPictureTmpl(CreatePictureTmplReqDTO req,
			CreatePictureTmplRespDTO resp) throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getPictureTmpl_(), errors, hb, true, null);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			TemplatePicture pic = new TemplatePicture();

			PictureTmplDTO dto = req.getPictureTmpl_();

			pic.setCreationDate(new Date());
			pic.setLastChangeDate(new Date());
			pic.setMd5Code(dto.getMd5Code());
			pic.setPicByteSize(dto.getPicByteSize());
			pic.setTenant((Tenant) hb.getSession().get(Tenant.class,
					dto.getTenantId()));
			pic.setxSize(dto.getXsize());
			pic.setySize(dto.getYsize());

			byte[] data = IOUtils.getStreamAsByteArray(dto.getPicture()
					.getInputStream());
			pic.setPicture(data);
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(pic);
			PictureTmplDTO ret = convertPictureTmplToPictureDTO(pic, false);
			resp.setPictureTmpl_(ret);
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

	private void validateCreateUpdate(PictureTmplDTO dto,
			List<ErrorType> errors, HibernateUtil hb, boolean create,
			TemplatePicture object) throws PfaException {
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
	public void updatePictureTmpl(UpdatePictureTmplReqDTO req,
			UpdatePictureTmplRespDTO resp) throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getPictureTmpl_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));

				return;
			}

			TemplatePicture picture = (TemplatePicture) hb.getSession().get(
					TemplatePicture.class, req.getPictureTmpl_().getId());
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getPictureTmpl_(), errors, hb, false,
					picture);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			PictureTmplDTO dto = req.getPictureTmpl_();
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
			if (dto.isTenantIdSpecified()) {
				picture.setTenant((Tenant) hb.getSession().get(Tenant.class,
						dto.getTenantId()));
			}
			if (dto.isXsizeSpecified()) {
				picture.setxSize(dto.getXsize());
			}
			if (dto.isYsizeSpecified()) {
				picture.setySize(dto.getYsize());
			}

			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(picture);
			resp.setPictureTmpl_(convertPictureTmplToPictureDTO(picture, false));
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
	public void deletePictureTmpl(DeletePictureTmplReqDTO req,
			DeletePictureTmplRespDTO resp) throws PfaException {
		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getPictureTmpl_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));
				return;
			}
			TemplatePicture pic = (TemplatePicture) hb.getSession().get(
					TemplatePicture.class, req.getPictureTmpl_().getId());
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

	public static PictureTmplDTO convertPictureTmplToPictureDTO(
			TemplatePicture picture, boolean pullPicture) {
		PictureTmplDTO dto = PfaSingleton.getReference().createObject(
				PictureTmplDTO.class);
		dto.setId(picture.getId());
		dto.setMd5Code(picture.getMd5Code());
		dto.setPicByteSize(picture.getPicByteSize());
		dto.setTenantId(picture.getTenant().getId());
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
