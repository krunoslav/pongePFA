package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadTenantRespDTO extends ResponseDto {
	@ProxyMethod(origMethod = "getTenants")
	public TenantDTO[] getTenants_();

	@ProxyMethod(origMethod = "setTenants")
	public void setTenants_(TenantDTO[] param);

	@ProxyMethod(origMethod = "addTenants")
	public void addTenants_(TenantDTO param);

}
