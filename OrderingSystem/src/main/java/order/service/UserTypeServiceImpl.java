package order.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import order.dao.UserTypeDAO;
import order.model.UserType;

@Service
@Transactional
public class UserTypeServiceImpl implements UserTypeService {

	@Autowired
	private UserTypeDAO userTypeDAO;

	public void addUserType(UserType userType) {
		userTypeDAO.addUserType(userType);
	}

	public void updateUserType(UserType userType) {
		userTypeDAO.updateUserType(userType);
	}

	public UserType getUserType(int user_type_id) {
		try {

			return userTypeDAO.getUserType(user_type_id);
		} catch (Exception e) {
			System.out.println("UserTypeServiceImpl : " + e.toString());
			return null;
		}
	}

	public void deleteUserType(int user_type_id) {

		try {
			userTypeDAO.deleteUserType(user_type_id);
		} catch (Exception e) {
			System.out.println("UserTypeServiceImpl delete : " + e.toString());

		}
	}

	@Override
	public List<UserType> getUserTypes() {
		return userTypeDAO.getUserTypes();
	}

}
