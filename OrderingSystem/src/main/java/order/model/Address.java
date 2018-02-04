package order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue
	private Integer address_id;
	
	@Size(min=3, max=20)
	private String state;
	
	@Size(min=3, max=20)
	private String city;
	
	@Size(min=3, max=20)
	private String street;
	
	@Pattern(regexp="[0-9]+")
	private String street_number;

	
	//Constructors
	public Address() {
		super();
	}
	
	public Address(Integer address_id, String state, String city, String street, String street_number) {
		super();
		this.address_id = address_id;
		this.state = state;
		this.city = city;
		this.street = street;
		this.street_number = street_number;
	}
	
	//Getters & Setters
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
}
