package hr.ponge.pfa;

import java.util.ArrayList;
import java.util.List;

/**
 * Main exception kruno, test test 
 * @author kruno
 *
 */
public class PfaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String PERSISTENCE_ERROR = "E0050";

	public static final String GENERAL_ERROR = "E0001";

	public static final String USER_AUTHENTICATION_FAILED = "E1000";
	public static final String USER_NOT_AUTHORIZED_FOR_OPERATION = "E1001";
	public static final String CLIENT_VERSION_NOT_SUPORTED = "E1002";
	public static final String METHOD_NOT_MAPPED = "E1003";
	public static final String ERROR_CALL_BL_METHOD = "E1004";
	public static final String REQUEST_VALIDATION_ERROR = "E1005";
	

	private String errorCode;
	private String errorMsgKey = "";

	private List<String> errorParams = new ArrayList<String>();

	public PfaException(String errorCode, String msgKey, Throwable cause) {
		super(msgKey, cause);
		this.errorCode = errorCode;
		this.errorMsgKey = msgKey;
	}

	public PfaException(String errorCode, String msgKey,
			List<String> errorParams, Throwable cause) {
		super(msgKey, cause);
		this.errorCode = errorCode;
		this.errorMsgKey = msgKey;
		if (errorParams != null) {
			this.errorParams.addAll(errorParams);
		}
	}

	public PfaException(String errorCode, String msgKey,
			List<String> errorParams) {
		super(msgKey, null);
		this.errorCode = errorCode;
		this.errorMsgKey = msgKey;
		if (errorParams != null) {
			this.errorParams.addAll(errorParams);
		}
	}

	public PfaException(String errorCode, String msgKey) {
		super(msgKey, null);
		this.errorCode = errorCode;
		this.errorMsgKey = msgKey;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsgKey() {
		return errorMsgKey;
	}

	public void setErrorMsgKey(String errorMsgKey) {
		this.errorMsgKey = errorMsgKey;
	}

	public List<String> getErrorParams() {
		return errorParams;
	}

	

	public void addErrorParam(String param) {
		errorParams.add(param);
	}

}
