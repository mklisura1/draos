package order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privilege")
public class UserPrivilege {
	
	@Id
	@GeneratedValue
	private Integer privilege_id;
	
	private String privilege_name;
	
	//Constructors
	public UserPrivilege() {
		super();
	}
	
	public UserPrivilege(Integer privilege_id, String privilege_name) {
		super();
		this.privilege_id = privilege_id;
		this.privilege_name = privilege_name;
	}
	
	//Getters & Setters
	public Integer getPrivilege_id() {
		return privilege_id;
	}
	public void setPrivilege_id(Integer privilege_id) {
		this.privilege_id = privilege_id;
	}
	public String getPrivilege_name() {
		return privilege_name;
	}
	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name;
	}
}
