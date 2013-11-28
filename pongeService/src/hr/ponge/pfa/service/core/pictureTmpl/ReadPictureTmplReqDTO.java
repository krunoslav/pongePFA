package hr.ponge.pfa.service.core.pictureTmpl;

import hr.ponge.pfa.service.base.ReadOutLimitsDTO;
import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface ReadPictureTmplReqDTO extends RequestDto {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public long getTenantId();

	public void setTenantId(long id);

	public boolean isTenantIdSpecified();

	@ProxyMethod(origMethod = "getLimits")
	public ReadOutLimitsDTO getLimits_();

	@ProxyMethod(origMethod = "setLimits")
	public void setLimits_(ReadOutLimitsDTO param);

	@ProxyMethod(origMethod = "isLimitsSpecified")
	public boolean isLimitsSpecified_();

}
