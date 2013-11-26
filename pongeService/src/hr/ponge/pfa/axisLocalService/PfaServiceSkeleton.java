package hr.ponge.pfa.axisLocalService;

import hr.ponge.pfa.PfaException;
import hr.ponge.pfa.axis.EntityOperations;
import hr.ponge.pfa.axis.EntityOperationsResponse;
import hr.ponge.pfa.axis.EsoRequestChoice_type0;
import hr.ponge.pfa.axis.EsoResponse;
import hr.ponge.pfa.axis.EsoResponseChoice_type0;
import hr.ponge.pfa.axis.base.ErrorType;
import hr.ponge.pfa.axis.base.ResponseMetaData;
import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.pfa.service.env.user.UserBL;
import hr.ponge.util.HibernateUtil;
import hr.ponge.util.PfaSingleton;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * PfaServiceSkeleton java skeleton for the axisService
 */
public class PfaServiceSkeleton implements
		hr.ponge.pfa.axis.PfaServiceSkeletonInterface {
	
	private static final Logger log= Logger.getLogger(PfaServiceSkeleton.class);

	@Override
	public EntityOperationsResponse entityOperations(
			EntityOperations entityOperations) {
		log.debug("REQUEST:"+entityOperations.toString());
		HibernateUtil hibernateUtil = new HibernateUtil();
		EntityOperationsResponse res = new EntityOperationsResponse();
		res.setEntityOperationsResponse(new EsoResponse());
		EsoResponse esoResp = res.getEntityOperationsResponse();
		ResponseMetaData meta = new ResponseMetaData();
		esoResp.setMetaData(meta);
		meta.setRequestId(entityOperations.getEntityOperations().getMetaData()
				.getRequestId());
		String operationName = entityOperations.getEntityOperations()
				.getMetaData().getOperation();
		res.getEntityOperationsResponse().getMetaData()
				.setOperation(operationName);
		res.setEntityOperationsResponse(esoResp);
		esoResp.setEsoResponseChoice_type0(new EsoResponseChoice_type0());
		try {
			long start=System.currentTimeMillis();
			log.debug("CALL OPERATION:"+operationName);
			Method method = PfaSingleton.getReference().resloveMethod(
					operationName);
			log.debug("METHOD NAME:"+method.getName());
			Class<?> operationClass = method.getDeclaringClass();
			log.debug("OPERATION CLASS:"+operationClass.getName());
			Object instance = operationClass.newInstance();
			RequestDto req = pullRequestFromEso(
					entityOperations.getEntityOperations().getEsoRequestChoice_type0(), operationName);
			ResponseDto resp = createNewResponse(method);
			putResponseInEso(esoResp.getEsoResponseChoice_type0(), resp,
					operationName);
			log.debug("TIME 1:"+(System.currentTimeMillis()-start));
			securityValidation(entityOperations.getEntityOperations()
					.getMetaData().getUsername(), entityOperations
					.getEntityOperations().getMetaData().getPassword(), null);
			log.debug("TIME 2:"+(System.currentTimeMillis()-start));
			versionValidation(entityOperations.getEntityOperations()
					.getMetaData().getClientVersion());
			log.debug("TIME 3:"+(System.currentTimeMillis()-start));
			
			callAppropriateOperation(method,instance,req,resp);
			log.debug("TIME 4:"+(System.currentTimeMillis()-start));
			

		} catch (PfaException e) {
			log.debug("PfaException", e);
			ErrorType error = new ErrorType();
			meta.setError(error);
			error.setErrorCode(e.getErrorCode());
			error.setErrorMessageKey(e.getErrorMsgKey());
			error.setErrorParams(e.getErrorParams().toArray(
					new String[e.getErrorParams().size()]));
			
			final Writer result = new StringWriter();
			final PrintWriter printWriter = new PrintWriter(result);
			e.printStackTrace(printWriter);
			String trace = result.toString();
			error.setStackTrace(trace);
			
		} catch (Exception e) {
			log.error("ERROR", e);
			try {
				hibernateUtil.rollbackTransaction();
				ErrorType error = new ErrorType();
				meta.setError(error);
				error.setErrorCode(hr.ponge.pfa.PfaException.GENERAL_ERROR);
				error.setErrorMessageKey(e.getMessage());
				final Writer result = new StringWriter();
				final PrintWriter printWriter = new PrintWriter(result);
				e.printStackTrace(printWriter);
				String trace = result.toString();
				error.setStackTrace(trace);
			} catch (PfaException e1) {
				throw new RuntimeException(e1);
			}
		} finally {
			try {
				hibernateUtil.rollbackTransaction();
			} catch (PfaException e) {
				throw new RuntimeException(e);
			}
		}
		return res;
	}

	private void callAppropriateOperation(Method method,
			Object instance, RequestDto req,ResponseDto resp) throws PfaException {
		try {
		
			method.invoke(instance, new Object[] { req, resp });

		} catch (IllegalAccessException e) {
			throw new PfaException(PfaException.ERROR_CALL_BL_METHOD,
					"illegalAccessException", e);
		}  catch (IllegalArgumentException e) {
			throw new PfaException(PfaException.ERROR_CALL_BL_METHOD,
					"IllegalArgumentException", e);

		} catch (InvocationTargetException e) {
			throw new PfaException(PfaException.ERROR_CALL_BL_METHOD,
					"errorInBussinesLogic", e);

		} 

	

	}

	private void putResponseInEso(EsoResponseChoice_type0 esoChoice,
			ResponseDto resp, String operation)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		String setter = "set" + operation.substring(0, 1).toUpperCase()
				+ operation.substring(1);

		Method[] meths = esoChoice.getClass().getMethods();
		for (Method m : meths) {
			if (m.getName().equals(setter)) {
				m.invoke(esoChoice, new Object[] { resp });
			}
		}

	}

	private ResponseDto createNewResponse(Method method)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		ResponseDto resp = null;
		Class<?>[] types = method.getParameterTypes();
		Class<?> r = types[1];
		String r1 = PfaSingleton.getReference().getBindReversProperty(
				r.getName());
		Class<?> cl = Class.forName(r1);
		resp = (ResponseDto) cl.newInstance();
		return resp;
	}

	private RequestDto pullRequestFromEso(EsoRequestChoice_type0 esoChoice,
			String operation) throws IllegalArgumentException,
			IllegalAccessException, InvocationTargetException, PfaException {
		RequestDto req = null;
		Method[] meths = esoChoice.getClass().getMethods();
		String geter = "get" + operation.substring(0, 1).toUpperCase()
				+ operation.substring(1);
		for (Method m : meths) {
			if (m.getName().equals(geter)) {
				Object o = m.invoke(esoChoice, new Object[0]);
				req = (RequestDto) o;
			}
		}
		if(req==null) {
			throw new PfaException(PfaException.ERROR_CALL_BL_METHOD, "operationRequestNull");
		}
		return req;
	}

	private void versionValidation(String clientVersion) {
		// TODO Auto-generated method stub

	}

	private void securityValidation(String username, String password,
			String resource) throws PfaException {
		UserBL bl = new UserBL();
		bl.userAuthentication(username, password);
		bl.userAuthorization(username, resource);
	}

}
