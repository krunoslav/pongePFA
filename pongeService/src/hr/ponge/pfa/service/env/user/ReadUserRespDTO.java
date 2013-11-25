package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadUserRespDTO extends ResponseDto {
	@ProxyMethod(origMethod = "getUsers")
	public UserDTO[] getUsers_();

	@ProxyMethod(origMethod = "setUsers")
	public void setUsers_(UserDTO[] param);

	@ProxyMethod(origMethod = "addUsers")
	public void addUsers_(UserDTO param);

}
