package hr.ponge.pfa.service.core.picture;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface DeletePictureRespDTO extends ResponseDto {

	@ProxyMethod(origMethod = "getPicture")
	public PictureDTO getPicture_();

	@ProxyMethod(origMethod = "setPicture")
	public void setPicture_(PictureDTO tenantDTO);
}
