package hr.ponge.pfa.service.core.document;

import hr.ponge.pfa.service.base.ResponseDto;
import hr.ponge.util.ProxyMethod;

public interface ReadDocumentRespDTO extends ResponseDto {

	
	@ProxyMethod(origMethod = "getDocuments")
	public DocumentDTO[] getDocuments_();

	@ProxyMethod(origMethod = "setDocuments")
	public void setDocuments_(DocumentDTO[] param);

	@ProxyMethod(origMethod = "addDocuments")
	public void addDocuments_(DocumentDTO param);

}
