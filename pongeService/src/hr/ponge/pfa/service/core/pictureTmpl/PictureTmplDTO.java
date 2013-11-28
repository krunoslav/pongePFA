package hr.ponge.pfa.service.core.pictureTmpl;

public interface PictureTmplDTO {

	public long getId();

	public void setId(long param);

	public boolean isIdSpecified();

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

	public long getTenantId();

	public void setTenantId(long param);

	public boolean isTenantIdSpecified();

}
