package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface CreateTenantReqDTO extends RequestDto {

	@ProxyMethod(origMethod = "getTenant")
	public TenantDTO getTenant_();

	@ProxyMethod(origMethod = "setTenant")
	public void setTenant_(TenantDTO tenantDTO);
}
