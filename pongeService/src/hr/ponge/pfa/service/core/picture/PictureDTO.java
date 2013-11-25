package hr.ponge.pfa.service.core.picture;

public interface PictureDTO {

	public long getId();

	public void setId(long param);

	public long getUserId();

	public void setUserId(long param);

	public java.lang.String getUsername();

	public void setUsername(java.lang.String param);

	public long getPicByteSize();

	public void setPicByteSize(long param);

	public long getXsize();

	public void setXsize(long param);

	public long getYsize();

	public void setYsize(long param);

	public javax.activation.DataHandler getPicture();

	public void setPicture(javax.activation.DataHandler param);

	public java.lang.String getMd5Code();

	public void setMd5Code(java.lang.String param);

}
