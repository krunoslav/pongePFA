package hr.ponge.pfa.service.env.tenant;

public interface TenantDTO {

	public long getId();

	public void setId(long id);

	public boolean isIdSpecified();
	
	public String getName();

	public void setName(String param);
	
	public boolean isNameSpecified();

}
