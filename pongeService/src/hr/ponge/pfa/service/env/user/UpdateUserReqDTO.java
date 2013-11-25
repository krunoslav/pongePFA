package hr.ponge.pfa.service.env.user;

import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface UpdateUserReqDTO extends RequestDto {

	@ProxyMethod(origMethod = "getUser")
	public UserDTO getUser_();

	@ProxyMethod(origMethod = "setUser")
	public void setUser_(UserDTO userDTO);
}
