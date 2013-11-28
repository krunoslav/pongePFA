package hr.ponge.pfa.service.core.pictureTmpl;

import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface UpdatePictureTmplRespDTO extends RequestDto {
	@ProxyMethod(origMethod = "getPictureTmpl")
	public PictureTmplDTO getPictureTmpl_();

	@ProxyMethod(origMethod = "setPictureTmpl")
	public void setPictureTmpl_(PictureTmplDTO tenantDTO);
}
