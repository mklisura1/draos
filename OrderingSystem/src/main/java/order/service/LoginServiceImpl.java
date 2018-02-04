package order.service;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import order.dao.UserDAO;
import order.model.User;

/*import crm.dao.UserDAO;
import crm.model.User;*/

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

}
