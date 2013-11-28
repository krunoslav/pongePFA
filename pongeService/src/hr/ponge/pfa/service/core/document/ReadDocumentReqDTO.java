package hr.ponge.pfa.service.core.document;

import hr.ponge.pfa.service.base.ReadOutLimitsDTO;
import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface ReadDocumentReqDTO extends RequestDto {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public long getUserId();

	public void setUserId(long param);

	public boolean isUserIdSpecified();

	public String getDescription();

	public void setDescription(String param);

	public boolean isDescriptionSpecified();

	@ProxyMethod(origMethod = "getLimits")
	public ReadOutLimitsDTO getLimits_();

	@ProxyMethod(origMethod = "setLimits")
	public void setLimits_(ReadOutLimitsDTO param);

	@ProxyMethod(origMethod = "isLimitsSpecified")
	public boolean isLimitsSpecified_();

}
