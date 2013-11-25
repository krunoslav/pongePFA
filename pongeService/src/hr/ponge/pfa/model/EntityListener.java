package hr.ponge.pfa.model;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.apache.log4j.Logger;

public class EntityListener {

	
	private static final Logger log = Logger.getLogger(EntityListener.class);

	@PrePersist
	@PreUpdate
	public void setAtributes(EntityPfa entitet) {

		entitet.setLastChangeDate(new Date());

		if (entitet.getCreationDate() == null) {
			entitet.setCreationDate(new Date());
		}

	

	}

	
}
