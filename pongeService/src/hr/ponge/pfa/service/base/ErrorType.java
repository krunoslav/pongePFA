package hr.ponge.pfa.service.base;

public interface ErrorType {

	public String getErrorCode();

	public void setErrorCode(String param);

	public String getErrorMessageKey();

	public void setErrorMessageKey(String param);

	public String[] getErrorParams();

	public void setErrorParams(String[] param);

	public String getStackTrace();

	public void setStackTrace(String param);

}
