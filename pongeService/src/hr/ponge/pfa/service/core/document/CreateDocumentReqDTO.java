package hr.ponge.pfa.service.core.document;

import hr.ponge.pfa.service.base.RequestDto;
import hr.ponge.util.ProxyMethod;

public interface CreateDocumentReqDTO extends RequestDto {

	@ProxyMethod(origMethod = "getDocument")
	public DocumentDTO getDocument_();

	@ProxyMethod(origMethod = "setDocument")
	public void setDocument_(DocumentDTO tenantDTO);
}
