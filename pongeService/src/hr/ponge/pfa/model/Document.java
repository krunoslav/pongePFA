package hr.ponge.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SequenceGenerator(name = "DOC_SEQ", sequenceName = "PFA_DOCUMENT_SEQUENCE", allocationSize = 1, initialValue=1000)
@Entity
@Table(name="PFA_DOCUMENT")
public class Document extends EntityPfa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOC_SEQ")
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	private String description = "";

	@Column(name = "description", nullable = false, length = 50)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String documentForm = "";

	@Column(name = "document_form", nullable = false, length = 10485760)
	public String getDocumentForm() {
		return documentForm;
	}

	public void setDocumentForm(String documentForm) {
		this.documentForm = documentForm;
	}

	private User user;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
