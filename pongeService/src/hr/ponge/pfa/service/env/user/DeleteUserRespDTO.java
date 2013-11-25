package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.ProxyMethod;

public interface DeleteUserRespDTO {
	
	@ProxyMethod(origMethod = "getUser")
	public UserDTO getUser_();

	@ProxyMethod(origMethod = "setUser")
	public void setUser_(UserDTO userDTO);

	@ProxyMethod(origMethod = "getErrors")
	public ErrorType[] getErrors_();

	@ProxyMethod(origMethod = "setErrors")
	public void setErrors_(ErrorType[] param);

	@ProxyMethod(origMethod = "addErrors")
	public void addErrors_(ErrorType param);
}
