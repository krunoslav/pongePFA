package hr.ponge.pfa.service.core.pictureTmpl;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadPictureTmplRespDTO extends ResponseDto {
	@ProxyMethod(origMethod = "getPictureTemplates")
	public PictureTmplDTO[] getPictureTemplates_();

	@ProxyMethod(origMethod = "setPictureTemplates")
	public void setPictureTemplates_(PictureTmplDTO[] param);

	@ProxyMethod(origMethod = "addPictureTemplates")
	public void addPictureTemplates_(PictureTmplDTO param);

}
