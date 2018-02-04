package order.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import order.model.UserType;

@Repository
public class UserTypeDAOImpl implements UserTypeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	

	public void addUserType(UserType userType) 
	{
		getCurrentSession().save(userType);
	}
	
	public void updateUserType(UserType userType) 
	{
		getCurrentSession().update(userType);
	}


	public UserType getUserType(int user_type_id) {
		try {
			
		UserType c = (UserType) getCurrentSession().get(UserType.class, user_type_id);
		return c;
		}
		catch (Exception e) {
			System.out.println("Error UserTypeDAOImpl : " + e.toString());
			return null;
		}
	}


	public void deleteUserType(int user_type_id) {
		try {
			
		UserType user_type = getUserType(user_type_id);
		if (user_type != null) {
			getCurrentSession().delete(user_type);
		}
		}
		catch (Exception e) {
			System.out.println("Error UserTypeDAOImpl delete: " + e.toString());
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<UserType> getUserTypes() {
		return getCurrentSession().createQuery("from UserType").list();
	}
}
