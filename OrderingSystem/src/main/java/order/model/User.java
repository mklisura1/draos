package order.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	private Integer user_id;
	
	@Size(min=3, max=20)
	private String user_name;
	
	@Size(min=3, max=20)
	private String user_first_name;
	
	@Size(min=3, max=20)
	private String user_last_name;
	
	private String user_password_salt;
	private String user_password_hash;	
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_type")
	@Cascade({CascadeType.SAVE_UPDATE})
	private UserType userType;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_privilege")
	@Cascade({CascadeType.SAVE_UPDATE})
	private UserPrivilege userPrivilege;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_address")
	@Cascade({CascadeType.SAVE_UPDATE})
	private Address userAddress;
	
	@Size(min=3, max=20)
	private String mobile_phone;
	
	@Email
	@NotEmpty
	private String user_email;
	
	private Date last_login_date;	
	
	//Constructors
	public User() {
		super();
	}
	
	public User(String user_name, String user_password_salt, String user_password_hash) {
		super();
		this.user_name = user_name;
		this.user_password_salt = user_password_salt;
		this.user_password_hash = user_password_hash;
	}
	
	public User(Integer user_id, String user_name, String user_first_name, String user_last_name,
			String user_password_salt, String user_password_hash, UserType userType, UserPrivilege userPrivilege,
			Address userAddress, String mobile_phone, String user_email, Date last_login_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_password_salt = user_password_salt;
		this.user_password_hash = user_password_hash;
		this.userType = userType;
		this.userPrivilege = userPrivilege;
		this.userAddress = userAddress;
		this.mobile_phone = mobile_phone;
		this.user_email = user_email;
		this.last_login_date = last_login_date;
	}
	
	//Getters & Setters
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_password_salt() {
		return user_password_salt;
	}
	public void setUser_password_salt(String user_password_salt) {
		this.user_password_salt = user_password_salt;
	}
	public String getUser_password_hash() {
		return user_password_hash;
	}
	public void setUser_password_hash(String user_password_hash) {
		this.user_password_hash = user_password_hash;
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
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Date getLast_login_date() {
		return last_login_date;
	}
	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}
}
