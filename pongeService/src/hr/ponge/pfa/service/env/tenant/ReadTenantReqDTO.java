package hr.ponge.pfa.service.env.tenant;

import hr.ponge.pfa.service.base.ReadOutLimitsDTO;
import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface ReadTenantReqDTO extends RequestDto {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public String getName();

	public void setName(String param);

	public boolean isNameSpecified();

	@ProxyMethod(origMethod = "getLimits")
	public ReadOutLimitsDTO getLimits_();

	@ProxyMethod(origMethod = "setLimits")
	public void setLimits_(ReadOutLimitsDTO param);

	@ProxyMethod(origMethod = "isLimitsSpecified")
	public boolean isLimitsSpecified_();


}
