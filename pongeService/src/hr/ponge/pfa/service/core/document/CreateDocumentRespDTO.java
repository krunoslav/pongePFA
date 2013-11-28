package hr.ponge.pfa.service.core.document;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface CreateDocumentRespDTO extends ResponseDto {
	
	@ProxyMethod(origMethod = "getDocument")
	public DocumentDTO getDocument_();

	@ProxyMethod(origMethod = "setDocument")
	public void setDocument_(DocumentDTO tenantDTO);
}
