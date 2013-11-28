package hr.ponge.pfa.service.core.document;

public interface DocumentDTO {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public String getDescription();

	public void setDescription(String param);

	public boolean isDescriptionSpecified();

	public javax.activation.DataHandler getDocumentForm();

	public void setDocumentForm(javax.activation.DataHandler param);

	public boolean isDocumentFormSpecified();

	public long getUserId();

	public void setUserId(long param);

	public boolean isUserIdSpecified();

}
