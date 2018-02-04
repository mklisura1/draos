package order.service;

import java.util.List;

import order.model.UserPrivilege;

public interface UserPrivilegeService {
	public void addUserPrivilege(UserPrivilege userPrivilege);
	public void updateUserPrivilege(UserPrivilege userPrivilege);
	public UserPrivilege getUserPrivilege(int user_privilege_id);
	public void deleteUserPrivilege(int user_privilege_id);
	public List<UserPrivilege> getUserPrivileges();
}
