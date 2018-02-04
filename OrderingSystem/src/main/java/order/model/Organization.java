package order.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="organization")
public class Organization {
	
	@Id
	@GeneratedValue
	private Integer organization_id;
	
	private String organization_name_part1;
	
	private String organization_name_part2;
	
	private String organization_logo;
	
	private String organization_phone_number;
	
	private String organization_name_min_part1;
	
	private String organization_name_min_part2;
	
	@OneToMany(mappedBy = "content", fetch=FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	private Set<Content> contents = new HashSet<Content>();
	
	//Constructors
	public Organization() {
		super();
	}
	
	public Organization(Integer organization_id, String organization_name_part1, String organization_name_part2,
			String organization_logo, String organization_phone_number, String organization_name_min_part1,
			String organization_name_min_part2, Set<Content> contents) {
		super();
		this.organization_id = organization_id;
		this.organization_name_part1 = organization_name_part1;
		this.organization_name_part2 = organization_name_part2;
		this.organization_logo = organization_logo;
		this.organization_phone_number = organization_phone_number;
		this.organization_name_min_part1 = organization_name_min_part1;
		this.organization_name_min_part2 = organization_name_min_part2;
		this.contents = contents;
	}

	//Getters & Setters
	public Integer getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(Integer organization_id) {
		this.organization_id = organization_id;
	}
	public String getOrganization_name_part1() {
		return organization_name_part1;
	}
	public void setOrganization_name_part1(String organization_name_part1) {
		this.organization_name_part1 = organization_name_part1;
	}
	public String getOrganization_name_part2() {
		return organization_name_part2;
	}
	public void setOrganization_name_part2(String organization_name_part2) {
		this.organization_name_part2 = organization_name_part2;
	}
	public String getOrganization_logo() {
		return organization_logo;
	}
	public void setOrganization_logo(String organization_logo) {
		this.organization_logo = organization_logo;
	}
	public String getOrganization_phone_number() {
		return organization_phone_number;
	}
	public void setOrganization_phone_number(String organization_phone_number) {
		this.organization_phone_number = organization_phone_number;
	}
	public String getOrganization_name_min_part1() {
		return organization_name_min_part1;
	}
	public void setOrganization_name_min_part1(String organization_name_min_part1) {
		this.organization_name_min_part1 = organization_name_min_part1;
	}
	public String getOrganization_name_min_part2() {
		return organization_name_min_part2;
	}
	public void setOrganization_name_min_part2(String organization_name_min_part2) {
		this.organization_name_min_part2 = organization_name_min_part2;
	}
	public Set<Content> getContents() {
		return contents;
	}
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
}
