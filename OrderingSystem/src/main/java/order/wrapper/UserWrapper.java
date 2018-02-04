package order.wrapper;

import javax.validation.Valid;

import order.model.Address;
import order.model.User;
import order.model.UserPrivilege;
import order.model.UserType;

public class UserWrapper {
	
	@Valid
	private User user;
	
	@Valid
	private Address address;
	private UserType userType;
	private UserPrivilege userPrivilege;
	
	//Constructors
	public UserWrapper() {
		super();
	}
	
	public UserWrapper(User user, Address address, UserType userType, UserPrivilege userPrivilege) {
		super();
		this.user = user;
		this.address = address;
		this.userType = userType;
		this.userPrivilege = userPrivilege;
	}
	
	//Getters & Setters
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public UserPrivilege getUserPrivilege() {
		return userPrivilege;
	}
	public void setUserPrivilege(UserPrivilege userPrivilege) {
		this.userPrivilege = userPrivilege;
	}
}
