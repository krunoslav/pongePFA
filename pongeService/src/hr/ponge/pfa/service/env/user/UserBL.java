package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.model.User;
import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.BusinessLogicMethod;
import hr.ponge.util.HibernateUtil;
import hr.ponge.util.ParamSelect;
import hr.ponge.util.PfaSingleton;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Query;

public class UserBL {

	@BusinessLogicMethod
	public void createUser(CreateUserReqDTO req, CreateUserRespDTO resp)
			throws PfaException {
		validateCreateUser(req, resp);
		if (resp.getErrors_() != null && resp.getErrors_().length > 0) {
			return;
		}

	}

	private void validateCreateUser(CreateUserReqDTO req, CreateUserRespDTO resp) {
		if (req.getUser_().isNameSpecified()) {
			if (req.getUser_().getName().length() < 3) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "name", "3" };
				er.setErrorParams(param);
				resp.addErrors_(er);
			}
		} else {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "name" };
			er.setErrorParams(param);
			resp.addErrors_(er);
		}

		if (req.getUser_().isSurnameSpecified()) {
			if (req.getUser_().getSurname().length() < 3) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "surname", "3" };
				er.setErrorParams(param);
				resp.addErrors_(er);
			}
		} else {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "surname" };
			er.setErrorParams(param);
			resp.addErrors_(er);
		}

		if (req.getUser_().isUsernameSpecified()) {
			if (req.getUser_().getSurname().length() < 5) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "username", "5" };
				er.setErrorParams(param);
				resp.addErrors_(er);
			}
		} else {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "username" };
			er.setErrorParams(param);
			resp.addErrors_(er);
		}
		
		if (req.getUser_().isPasswordSpecified()) {
			if (req.getUser_().getSurname().length() < 5) {
				ErrorType er = PfaSingleton.getReference().createObject(
						ErrorType.class);
				er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
				er.setErrorMessageKey("fieldMinChars");
				String[] param = new String[] { "username", "5" };
				er.setErrorParams(param);
				resp.addErrors_(er);
			}
		} else {
			ErrorType er = PfaSingleton.getReference().createObject(
					ErrorType.class);
			er.setErrorCode(PfaException.REQUEST_VALIDATION_ERROR);
			er.setErrorMessageKey("fieldNotSpecified");
			String[] param = new String[] { "username" };
			er.setErrorParams(param);
			resp.addErrors_(er);
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

	}

	@BusinessLogicMethod
	public void deleteUser(DeleteUserReqDTO req, DeleteUserRespDTO resp)
			throws PfaException {

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
		dto.setAddress(user.getAddress());
		dto.setDateOfBirth(user.getDateOfBirth());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(user.getLastAccessTime());
		dto.setLastAccessTime(gc);
		dto.setName(user.getName());
		dto.setSurname(user.getName());
		dto.setTenantId(user.getTenant().getId());
		dto.setTenantName(user.getTenant().getName());
		dto.setUsername(user.getUsername());

		return dto;
	}

}
