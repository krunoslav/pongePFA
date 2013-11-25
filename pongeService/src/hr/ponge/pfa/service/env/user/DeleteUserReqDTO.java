package hr.ponge.pfa.service.env.user;

import hr.ponge.util.ProxyMethod;

public interface DeleteUserReqDTO {

	@ProxyMethod(origMethod = "getUser")
	public UserDTO getUser_();

	@ProxyMethod(origMethod = "setUser")
	public void setUser_(UserDTO userDTO);
}
