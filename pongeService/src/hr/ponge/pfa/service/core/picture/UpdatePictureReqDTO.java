package hr.ponge.pfa.service.core.picture;

import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface UpdatePictureReqDTO extends RequestDto {

	@ProxyMethod(origMethod = "getPicture")
	public PictureDTO getPicture_();

	@ProxyMethod(origMethod = "setPicture")
	public void setPicture_(PictureDTO tenantDTO);
}
