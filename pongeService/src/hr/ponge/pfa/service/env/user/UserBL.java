package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.Tenant;
import hr.ponge.pfa.model.User;
import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.BusinessLogicMethod;
import hr.ponge.util.HibernateUtil;
import hr.ponge.util.ParamSelect;
import hr.ponge.util.PfaSingleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;

public class UserBL {
	
	private static final Logger log = Logger.getLogger(UserBL.class);

	@BusinessLogicMethod
	public void createUser(CreateUserReqDTO req, CreateUserRespDTO resp)
			throws PfaException {
		HibernateUtil hb = new HibernateUtil();
		try {
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdateUser(req.getUser_(), errors, hb, true, null);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}
			
			User user = new User();

			UserDTO dto = req.getUser_();
			if (dto.isAddressSpecified()) {
				user.setAddress(dto.getAddress());
			}
			if (dto.isDateOfBirthSpecified())
				user.setDateOfBirth(dto.getDateOfBirth());

			user.setDateOfBirth(dto.getDateOfBirth());
			user.setLastAccessTime(new Date());
			user.setLastChangeDate(new Date());
			user.setName(dto.getName());
			user.setPassword(dto.getPassword());
			user.setSurname(dto.getSurname());
			user.setTenant((Tenant) hb.getSession().load(Tenant.class,
					dto.getTenantId()));
			user.setUsername(dto.getUsername());
			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(user);
			resp.setUser_(convertUserToUserDTO(user));
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

	private void validateCreateUpdateUser(UserDTO dto, List<ErrorType> errors,
			HibernateUtil hb, boolean create, User user) throws PfaException {
		if (dto.isNameSpecified()) {
			if (dto.getName().length() < 3) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "name", "3" };
				er.setErrorParams(param);
				errors.add(er);

			}

			if (dto.getName().length() > 250) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMaxChars");
				String[] param = new String[] { "name", "250" };
				er.setErrorParams(param);
				errors.add(er);
			}
		} else {
			if (create) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldNotSpecified");
				String[] param = new String[] { "name" };
				er.setErrorParams(param);
				errors.add(er);
			}
		}

		if (dto.isSurnameSpecified()) {
			if (dto.getSurname().length() < 3) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "surname", "3" };
				er.setErrorParams(param);
				errors.add(er);
			}
			if (dto.getSurname().length() > 250) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMaxChars");
				String[] param = new String[] { "surname", "250" };
				er.setErrorParams(param);
				errors.add(er);
			}
		} else {
			if (create) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldNotSpecified");
				String[] param = new String[] { "surname" };
				er.setErrorParams(param);
				errors.add(er);
			}
		}

		if (dto.isUsernameSpecified()) {
			if (dto.getUsername().length() < 5) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "username", "5" };
				er.setErrorParams(param);
				errors.add(er);
			}
			if (dto.getUsername().length() > 250) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMaxChars");
				String[] param = new String[] { "username", "250" };
				er.setErrorParams(param);
				errors.add(er);
			}
		} else {
			if (create) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldNotSpecified");
				String[] param = new String[] { "username" };
				er.setErrorParams(param);
				errors.add(er);
			}
		}

		if (dto.isPasswordSpecified()) {
			if (dto.getPassword().length() < 5) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "password", "5" };
				er.setErrorParams(param);
				errors.add(er);
			}
			if (dto.getPassword().length() > 250) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMaxChars");
				String[] param = new String[] { "password", "250" };
				er.setErrorParams(param);
				errors.add(er);
			}
		} else {
			if (create) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldNotSpecified");
				String[] param = new String[] { "password" };
				er.setErrorParams(param);
				errors.add(er);
			}
		}

		if (create && !dto.isTenantIdSpecified()) {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "tenantId" };
			er.setErrorParams(param);
			errors.add(er);
		}
		if (!create && !dto.isIdSpecified()) {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "id" };
			er.setErrorParams(param);
			errors.add(er);
		}

		if (errors.size() > 0) {
			return;
		}

		if (dto.isUsernameSpecified()) {
			try {
				String sql = "Select u.id from User u where u.username=:usrname and u.tenant.id=:tenId ";
				ParamSelect ps = new ParamSelect();
				ps.addParametar("usrname", dto.getUsername());
				ps.addParametar("tenId", dto.getTenantId());
				if (!create) {
					sql = sql + " and u.id<>:id ";
					ps.addParametar("id", dto.getId());
				}
				Query q = hb.getSession().createQuery(sql);
				ps.processQuery(q);

				List lb = q.list();

				if (lb.size() > 0) {
					ErrorType er = PfaSingleton.getReference().createObject(
							ErrorType.class);
					er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
					er.setErrorMessageKey("usernameTaken");
					String[] param = new String[] { dto.getUsername() };
					er.setErrorParams(param);
					errors.add(er);
				}
			} catch (HibernateException e) {
				PfaException pf = new PfaException(
						PfaException.PERSISTENCE_ERROR, e.getMessage(), e);
				throw pf;
			}
		}

	}

	@BusinessLogicMethod
	public void readUser(ReadUserReqDTO req, ReadUserRespDTO resp)
			throws PfaException {

		validateReadUserRequest(req, resp);
		if (resp.getErrors_() != null && resp.getErrors_().length > 0) {
			return;
		}

		HibernateUtil hb = new HibernateUtil();
		ParamSelect ps = new ParamSelect();
		String sel = "Select u from User u "
				+ " inner join fetch u.tenant as t " + " where u.id != 0 ";

		if (req.isIdSpecified()) {
			sel = sel + " and u.id=:id ";
			ps.addParametar("id", req.getId());
		}
		if (req.isNameSpecified()) {
			sel = sel + " and upper(u.name) like :name ";
			ps.addParametar("name", req.getName().toUpperCase());
		}
		if (req.isAddressSpecified()) {
			sel = sel + " and upper(u.address) like :address ";
			ps.addParametar("address", req.getAddress().toUpperCase());
		}
		if (req.isSurnameSpecified()) {
			sel = sel + " and upper(u.surname) like :surname ";
			ps.addParametar("surname", req.getSurname().toUpperCase());
		}

		if (req.isUsernameSpecified()) {
			sel = sel + " and upper(u.username) like :username ";
			ps.addParametar("username", req.getUsername().toUpperCase());
		}
		if (req.isLimitsSpecified_()) {
			ps.setFirstRow(req.getLimits_().getFirstRecord());
			ps.setMaxRows(req.getLimits_().getMaxRecords());
		}
		if (req.isTenantIdSpecified()) {
			sel = sel + " and t.id=:tenId ";
			ps.addParametar("tenId", req.getTenantId());
		}

		Query query = hb.getSession().createQuery(sel);
		ps.processQuery(query);
		List<User> l = query.list();
		for (User u : l) {
			resp.addUsers_(convertUserToUserDTO(u));
		}

	}

	private void validateReadUserRequest(ReadUserReqDTO req,
			ReadUserRespDTO resp) {
		if (!req.isTenantIdSpecified()) {
			ErrorType err = PfaSingleton.getReference().createObject(
					ErrorType.class);
			err.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			err.setErrorMessageKey("tenantIdMustBeSpecified");
			resp.addErrors_(err);

		}

	}

	@BusinessLogicMethod
	public void updateUser(UpdateUserReqDTO req, UpdateUserRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			User user = (User) hb.getSession().get(User.class,
					req.getUser_().getId());
			List<ErrorType> errors = new ArrayList<ErrorType>();
			validateCreateUpdateUser(req.getUser_(), errors, hb, false, user);
			if (errors.size() > 0) {
				resp.setErrors_(errors.toArray(new ErrorType[errors.size()]));
				return;
			}

			UserDTO dto = req.getUser_();
			if (dto.isAddressSpecified()) {
				user.setAddress(dto.getAddress());
			}
			if (dto.isDateOfBirthSpecified())
				user.setDateOfBirth(dto.getDateOfBirth());

			user.setLastAccessTime(new Date());
			user.setLastChangeDate(new Date());
			if (dto.isNameSpecified())
				user.setName(dto.getName());
			if (dto.isPasswordSpecified())
				user.setPassword(dto.getPassword());
			if (dto.isSurnameSpecified())
				user.setSurname(dto.getSurname());
			if (dto.isUsernameSpecified())
				user.setUsername(dto.getUsername());

			boolean myTransaction = hb.beginTransaction();
			hb.getSession().persist(user);
			resp.setUser_(convertUserToUserDTO(user));
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
	public void deleteUser(DeleteUserReqDTO req, DeleteUserRespDTO resp)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();
		try {
			User user = (User) hb.getSession().get(User.class,
					req.getUser_().getId());
			boolean myTran = hb.beginTransaction();

			hb.getSession().delete(user);
			hb.getSession().flush();
			if (myTran) {
				hb.commitTransaction();
			}

		} catch (PfaException e) {
			hb.rollbackTransaction();
			throw e;

		} catch (org.hibernate.exception.ConstraintViolationException e) {
			log.error(e.getMessage(),e);
			hb.rollbackTransaction();
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("entityCannotBeDeletedItIsUsedByOtherEntities");
			resp.addErrors_(er);
		} catch (Throwable e) {
			log.error(e.getMessage(),e);
			hb.rollbackTransaction();
		
			throw new PfaException(PfaException.PERSISTENCE_ERROR, e.getMessage(), e);
		}

	}

	public void userAuthentication(String username, String password)
			throws PfaException {

		HibernateUtil hb = new HibernateUtil();

		List<?> l = hb
				.getSession()
				.createQuery(
						"Select u.username from User u "
								+ " where u.username=:user "
								+ " and u.password=:pass")
				.setParameter("user", username).setParameter("pass", password)
				.list();
		if (l == null || l.size() == 0) {
			throw new PfaException(PfaException.USER_AUTHENTICATION_FAILED,
					"userNotAuthenticated");
		}

	}

	public void userAuthorization(String username, String resource) {

	}

	public static UserDTO convertUserToUserDTO(User user) {
		UserDTO dto = PfaSingleton.getReference().createObject(UserDTO.class);
		dto.setId(user.getId());
		dto.setAddress(user.getAddress());
		dto.setDateOfBirth(user.getDateOfBirth());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(user.getLastAccessTime());
		dto.setLastAccessTime(gc);
		dto.setName(user.getName());
		dto.setSurname(user.getSurname());
		dto.setTenantId(user.getTenant().getId());
		dto.setTenantName(user.getTenant().getName());
		dto.setUsername(user.getUsername());

		return dto;
	}

}
