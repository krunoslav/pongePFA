package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface CreateTenantRespDTO extends ResponseDto {

	@ProxyMethod(origMethod = "getTenant")
	public TenantDTO getTenant_();

	@ProxyMethod(origMethod = "setTenant")
	public void setTenant_(TenantDTO tenantDTO);

}
