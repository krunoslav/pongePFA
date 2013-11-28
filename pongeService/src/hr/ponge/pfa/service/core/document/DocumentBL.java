package hr.ponge.pfa.service.core.document;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.Document;
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

public class DocumentBL extends BussinesLogic {

	private static final Logger log = Logger.getLogger(DocumentBL.class);

	@BusinessLogicMethod
	public void readDocument(ReadDocumentReqDTO req, ReadDocumentRespDTO resp)
			throws PfaException {

		validateReadRequset(req, resp);
		if (resp.getErrors_() != null && resp.getErrors_().length > 0) {
			return;
		}

		HibernateUtil hb = new HibernateUtil();
		ParamSelect ps = new ParamSelect();
		String sel = "Select d from Document d "
				+ " inner join fetch d.user as u" + " where d.id != 0 ";

		if (req.isIdSpecified()) {
			sel = sel + " and p.id=:id ";
			ps.addParametar("id", req.getId());
		}

		if (req.isUserIdSpecified()) {
			sel = sel + " and u.id=:uId ";
			ps.addParametar("uId", req.getUserId());
		}
		if (req.isLimitsSpecified_()) {
			ps.setFirstRow(req.getLimits_().getFirstRecord());
			ps.setMaxRows(req.getLimits_().getMaxRecords());
		}

		Query query = hb.getSession().createQuery(sel);
		ps.processQuery(query);
		List<Document> l = query.list();
		for (Document p : l) {
			resp.addDocuments_(convertDocumentToDocumentDTO(p));
		}

	}

	private void validateReadRequset(ReadDocumentReqDTO req,
			ReadDocumentRespDTO resp) {

	}

	@BusinessLogicMethod
	public void createDocument(CreateDocumentReqDTO req,
			CreateDocumentRespDTO resp) throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getDocument_(), errors, hb, true, null);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			Document doc = new Document();

			DocumentDTO dto = req.getDocument_();

			doc.setCreationDate(new Date());
			doc.setLastChangeDate(new Date());

			doc.setUser((User) hb.getSession().get(User.class, dto.getUserId()));

			byte[] data = IOUtils.getStreamAsByteArray(dto.getDocumentForm()
					.getInputStream());
			String s = new String(data);
			doc.setDocumentForm(s);
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(doc);
			DocumentDTO ret = convertDocumentToDocumentDTO(doc);
			resp.setDocument_(ret);
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

	private void validateCreateUpdate(DocumentDTO dto, List<ErrorType> errors,
			HibernateUtil hb, boolean create, Document object)
			throws PfaException {
		if (!dto.isDescriptionSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "Description" }));
		}

		if (!dto.isDocumentFormSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "DocumentForm" }));
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

	}

	@BusinessLogicMethod
	public void updateDocument(UpdateDocumentReqDTO req,
			UpdateDocumentRespDTO resp) throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getDocument_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));

				return;
			}

			Document doc = (Document) hb.getSession().get(Document.class,
					req.getDocument_().getId());
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(req.getDocument_(), errors, hb, false, doc);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			DocumentDTO dto = req.getDocument_();
			if (dto.isDescriptionSpecified()) {
				doc.setDescription(dto.getDescription());
			}
			

			doc.setLastChangeDate(new Date());
			if (dto.isDocumentFormSpecified()) {
				byte[] data = IOUtils.getStreamAsByteArray(dto.getDocumentForm()
						.getInputStream());
				String s= new String(data);
				doc.setDocumentForm(s);
			}
			if (dto.isUserIdSpecified()) {
				doc.setUser((User) hb.getSession().get(User.class,
						dto.getUserId()));
			}
			
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(doc);
			resp.setDocument_(convertDocumentToDocumentDTO(doc));
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
	public void deleteDocument(DeleteDocumentReqDTO req,
			DeleteDocumentRespDTO resp) throws PfaException {
		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getDocument_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));
				return;
			}
			Document doc = (Document) hb.getSession().get(Document.class,
					req.getDocument_().getId());
			boolean myTran = hb.beginTransaction();

			hb.getSession().delete(doc);
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

	public static DocumentDTO convertDocumentToDocumentDTO(Document doc) {
		DocumentDTO dto = PfaSingleton.getReference().createObject(
				DocumentDTO.class);
		dto.setId(doc.getId());
		dto.setDescription(doc.getDescription());
		dto.setUserId(doc.getUser().getId());

		ByteArrayDataSource rawData = new ByteArrayDataSource(doc
				.getDocumentForm().getBytes());
		DataHandler data = new DataHandler(rawData);
		dto.setDocumentForm(data);

		return dto;
	}
}
