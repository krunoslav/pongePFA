package hr.ponge.pfa.service.base;

public interface RequestMetaData {

	public String getRequestId();

	public void setRequestId(String param);

	public String getUsername();

	public void setUsername(String param);

	public String getPassword();

	public void setPassword(String param);

	public String getOperation();

	public void setOperation(String param);
}
