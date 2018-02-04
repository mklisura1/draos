package order.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="content")
public class Content {
	
	@Id
	@GeneratedValue
	private Integer content_id;
	
	private String content_name;
	
	private String content;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "organization_id")
	private Organization organization;
	
	//Constructors
	public Content() {
		super();
	}
	
	public Content(Integer content_id, String content_name, String content, Organization organization) {
		super();
		this.content_id = content_id;
		this.content_name = content_name;
		this.content = content;
		this.organization = organization;
	}
	
	//Getters & Setters
	public Integer getContent_id() {
		return content_id;
	}
	public void setContent_id(Integer content_id) {
		this.content_id = content_id;
	}
	public String getContent_name() {
		return content_name;
	}
	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
