package order.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import order.dao.UserPrivilegeDAO;
import order.model.UserPrivilege;

@Service
@Transactional
public class UserPrivilegeServiceImpl implements UserPrivilegeService {

	@Autowired
	private UserPrivilegeDAO userPrivilegeDAO;

	public void addUserPrivilege(UserPrivilege userPrivilege) {
		userPrivilegeDAO.addUserPrivilege(userPrivilege);
	}

	public void updateUserPrivilege(UserPrivilege userPrivilege) {
		userPrivilegeDAO.updateUserPrivilege(userPrivilege);
	}

	public UserPrivilege getUserPrivilege(int user_privilege_id) {
		try {

			return userPrivilegeDAO.getUserPrivilege(user_privilege_id);
		} catch (Exception e) {
			System.out.println("UserPrivilegeServiceImpl : " + e.toString());
			return null;
		}
	}

	public void deleteUserPrivilege(int user_privilege_id) {

		try {
			userPrivilegeDAO.deleteUserPrivilege(user_privilege_id);
		} catch (Exception e) {
			System.out.println("UserPrivilegeServiceImpl delete : " + e.toString());

		}
	}

	@Override
	public List<UserPrivilege> getUserPrivileges() {
		return userPrivilegeDAO.getUserPrivileges();
	}

}
