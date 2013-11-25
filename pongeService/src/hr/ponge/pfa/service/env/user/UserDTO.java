package hr.ponge.pfa.service.env.user;

import java.util.Calendar;
import java.util.Date;

public interface UserDTO {
	
	
	public long getId();
	
	public void setId(long id);
	
	public boolean isIdSpecified();

	public String getName();

	public void setName(String param);
	
	public boolean isNameSpecified();

	public String getSurname();

	public void setSurname(String param);
	
	public boolean isSurnameSpecified();

	public String getUsername();

	public void setUsername(String param);
	
	public boolean isUsernameSpecified();

	public String getAddress();

	public void setAddress(String param);
	
	public boolean isAddressSpecified();

	public Date getDateOfBirth();

	public void setDateOfBirth(Date param);
	
	public boolean isDateOfBirthSpecified();

	public Calendar getLastAccessTime();

	public void setLastAccessTime(Calendar param);
	
	public boolean isLastAccessTimeSpecified();

	public long getTenantId();

	public void setTenantId(long param);
	
	public boolean isTenantIdSpecified();

	public String getTenantName();

	public void setTenantName(String param);
	
	public boolean isTenantNameSpecified();
	
	public String getPassword();

	public void setPassword(String param);
	
	public boolean isPasswordSpecified();

}
