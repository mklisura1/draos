package order.service;

import java.util.List;

import order.model.UserType;

public interface UserTypeService {
	public void addUserType(UserType userType);
	public void updateUserType(UserType userType);
	public UserType getUserType(int user_type_id);
	public void deleteUserType(int user_type_id);
	public List<UserType> getUserTypes();
}
