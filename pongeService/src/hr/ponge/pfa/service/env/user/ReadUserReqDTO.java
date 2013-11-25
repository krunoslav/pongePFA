package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.service.base.ReadOutLimitsDTO;
import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface ReadUserReqDTO extends RequestDto {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public String getUsername();

	public void setUsername(String param);

	public boolean isUsernameSpecified();

	public String getName();

	public void setName(String param);

	public boolean isNameSpecified();

	public String getSurname();

	public void setSurname(String param);

	public boolean isSurnameSpecified();

	public String getAddress();

	public void setAddress(String param);

	public boolean isAddressSpecified();

	@ProxyMethod(origMethod = "getLimits")
	public ReadOutLimitsDTO getLimits_();

	@ProxyMethod(origMethod = "setLimits")
	public void setLimits_(ReadOutLimitsDTO param);

	@ProxyMethod(origMethod = "isLimitsSpecified")
	public boolean isLimitsSpecified_();

	public long getTenantId();

	public void setTenantId(long id);

	public boolean isTenantIdSpecified();

}
