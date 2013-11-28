package hr.ponge.pfa.service.core.picture;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadPictureRespDTO extends ResponseDto {
	@ProxyMethod(origMethod = "getPictures")
	public PictureDTO[] getPictures_();

	@ProxyMethod(origMethod = "setPictures")
	public void setPictures_(PictureDTO[] param);

	@ProxyMethod(origMethod = "addPictures")
	public void addPictures_(PictureDTO param);

}
