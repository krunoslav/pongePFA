package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadUserRespDTO extends ResponseDto {
	@ProxyMethod(origMethod = "getUsers")
	public UserDTO[] getUsers_();

	@ProxyMethod(origMethod = "setUsers")
	public void setUsers_(UserDTO[] param);

	@ProxyMethod(origMethod = "addUsers")
	public void addUsers_(UserDTO param);

	@ProxyMethod(origMethod = "getErrors")
	public ErrorType[] getErrors_();

	@ProxyMethod(origMethod = "setErrors")
	public void setErrors_(ErrorType[] param);

	@ProxyMethod(origMethod = "addErrors")
	public void addErrors_(ErrorType param);

}
