package hr.ponge.pfa.service.core.picture;

public interface PictureDTO{

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

	public long getUserId();

	public void setUserId(long param);

	public boolean isUserIdSpecified();

	public long getPicByteSize();

	public void setPicByteSize(long param);

	public boolean isPicByteSizeSpecified();

	public long getXsize();

	public void setXsize(long param);

	public boolean isXsizeSpecified();

	public long getYsize();

	public void setYsize(long param);

	public boolean isYsizeSpecified();

	public javax.activation.DataHandler getPicture();

	public void setPicture(javax.activation.DataHandler param);

	public boolean isPictureSpecified();

	public String getMd5Code();

	public void setMd5Code(java.lang.String param);

	public boolean isMd5CodeSpecified();

}
