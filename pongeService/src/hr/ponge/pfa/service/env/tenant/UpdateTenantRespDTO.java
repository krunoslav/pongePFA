package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.ProxyMethod;

public interface UpdateTenantRespDTO {
	
	@ProxyMethod(origMethod = "getTenant")
	public TenantDTO getTenant_();

	@ProxyMethod(origMethod = "setTenant")
	public void setTenant_(TenantDTO tenantDTO);

	@ProxyMethod(origMethod = "getErrors")
	public ErrorType[] getErrors_();

	@ProxyMethod(origMethod = "setErrors")
	public void setErrors_(ErrorType[] param);

	@ProxyMethod(origMethod = "addErrors")
	public void addErrors_(ErrorType param);
}
