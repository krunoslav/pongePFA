package hr.ponge.pfa.service.env.user;

import java.util.Calendar;
import java.util.Date;

public interface UserDTO {
	
	
	public long getId();
	
	public void setId(long id);

	public String getName();

	public void setName(String param);

	public String getSurname();

	public void setSurname(String param);

	public String getUsername();

	public void setUsername(String param);

	public String getAddress();

	public void setAddress(String param);

	public Date getDateOfBirth();

	public void setDateOfBirth(Date param);

	public Calendar getLastAccessTime();

	public void setLastAccessTime(Calendar param);

	public long getTenantId();

	public void setTenantId(long param);

	public String getTenantName();

	public void setTenantName(String param);

}
