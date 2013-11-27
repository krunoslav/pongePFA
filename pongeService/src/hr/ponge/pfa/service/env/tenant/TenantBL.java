package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.Tenant;
import hr.ponge.pfa.service.BussinesLogic;
import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.BusinessLogicMethod;
import hr.ponge.util.HibernateUtil;
import hr.ponge.util.ParamSelect;
import hr.ponge.util.PfaSingleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;

public class TenantBL extends BussinesLogic {

	private static final Logger log = Logger.getLogger(TenantBL.class);

	@BusinessLogicMethod
	public void createTenant(CreateTenantReqDTO req, CreateTenantRespDTO resp)
			throws PfaException {
		HibernateUtil hb = new HibernateUtil();
		try {
			TenantDTO dto = req.getTenant_();
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(hb, dto, errors, true, null);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}
			Tenant tenant = new Tenant();

			tenant.setName(dto.getName());
			tenant.setCreationDate(new Date());
			tenant.setLastChangeDate(new Date());
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(tenant);
			resp.setTenant_(convertTenantToTenantDTO(tenant));
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

	private void validateCreateUpdate(HibernateUtil hb, TenantDTO dto,
			List<ErrorType> errors, boolean create, Tenant tenant)
			throws PfaException {

		if (!create && !dto.isIdSpecified()) {
			errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
					"fieldNotSpecified", new String[] { "id" }));
			return;
		}

		if (dto.isNameSpecified()) {
			if (dto.getName().length() < 3) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"fieldMinChars", new String[] { "name", "3" }));

			}
			if (dto.getName().length() > 250) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"fieldMaxChars", new String[] { "name", "250" }));

			}
			if (create && nameExists(dto.getName(), 0, hb)) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"nameTaken", new String[] { dto.getName() }));

			}
			if (!create && nameExists(dto.getName(), dto.getId(), hb)) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"nameTaken", new String[] { dto.getName() }));

			}

		} else {
			if (create) {
				errors.add(createError(PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "name" }));

			}
		}
	}

	private boolean nameExists(String name, long id, HibernateUtil hb)
			throws PfaException {
		String sql = "Select t.id from Tenant u where t.name=:name and t.id<>:id ";
		ParamSelect ps = new ParamSelect();
		ps.addParametar("name", name);
		ps.addParametar("id", id);

		Query q = hb.getSession().createQuery(sql);
		ps.processQuery(q);
		List l = q.list();
		if (l.size() > 0) {
			return true;
		}
		return false;
	}

	@BusinessLogicMethod
	public void readTenant(ReadTenantReqDTO req, ReadTenantRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		ParamSelect ps = new ParamSelect();
		String sel = "Select t from Tenant t " + " where u.id != 0 ";

		if (req.isIdSpecified()) {
			sel = sel + " and u.id=:id ";
			ps.addParametar("id", req.getId());
		}
		if (req.isNameSpecified()) {
			sel = sel + " and upper(t.name) like :name ";
			ps.addParametar("name", req.getName().toUpperCase());
		}

		if (req.isLimitsSpecified_()) {
			ps.setFirstRow(req.getLimits_().getFirstRecord());
			ps.setMaxRows(req.getLimits_().getMaxRecords());
		}

		Query query = hb.getSession().createQuery(sel);
		ps.processQuery(query);
		List<Tenant> l = query.list();
		for (Tenant t : l) {

			resp.addTenants_(convertTenantToTenantDTO(t));
		}

	}

	@BusinessLogicMethod
	public void updateTenant(UpdateTenantReqDTO req, UpdateTenantRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getTenant_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));

				return;
			}

			Tenant tenant = (Tenant) hb.getSession().get(Tenant.class,
					req.getTenant_().getId());
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdate(hb, req.getTenant_(), errors, false, tenant);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			TenantDTO dto = req.getTenant_();
			if (dto.isNameSpecified()) {
				tenant.setName(dto.getName());
			}

			tenant.setLastChangeDate(new Date());

			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(tenant);
			resp.setTenant_(convertTenantToTenantDTO(tenant));
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
	public void deleteTenant(DeleteTenantReqDTO req, DeleteTenantRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			if (!req.getTenant_().isIdSpecified()) {
				resp.addErrors_(createError(
						PfaException.REQUEST_VALIDATION_ERROR,
						"fieldNotSpecified", new String[] { "id" }));
				return;
			}

			Tenant tenant = (Tenant) hb.getSession().get(Tenant.class,
					req.getTenant_().getId());
			boolean myTran = hb.beginTransaction();

			hb.getSession().delete(tenant);
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
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("entityCannotBeDeletedItIsUsedByOtherEntities");
			resp.addErrors_(er);
		} catch (Throwable e) {
			log.error(e.getMessage(), e);
			hb.rollbackTransaction();

			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}

	}

	public static TenantDTO convertTenantToTenantDTO(Tenant t) {
		TenantDTO dto = PfaSingleton.getReference().createObject(
				TenantDTO.class);
		dto.setId(t.getId());
		dto.setName(t.getName());
		return dto;
	}
}
