package order.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import order.model.UserPrivilege;

@Repository
public class UserPrivilegeDAOImpl implements UserPrivilegeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	

	public void addUserPrivilege(UserPrivilege userPrivilege) 
	{
		getCurrentSession().save(userPrivilege);
	}
	
	public void updateUserPrivilege(UserPrivilege userPrivilege) 
	{
		getCurrentSession().update(userPrivilege);
	}


	public UserPrivilege getUserPrivilege(int user_privilege_id) {
		try {
			
		UserPrivilege c = (UserPrivilege) getCurrentSession().get(UserPrivilege.class, user_privilege_id);
		return c;
		}
		catch (Exception e) {
			System.out.println("Error UserPrivilegeDAOImpl : " + e.toString());
			return null;
		}
	}


	public void deleteUserPrivilege(int user_privilege_id) {
		try {
			
		UserPrivilege user_privilege = getUserPrivilege(user_privilege_id);
		if (user_privilege != null) {
			getCurrentSession().delete(user_privilege);
		}
		}
		catch (Exception e) {
			System.out.println("Error UserPrivilegeDAOImpl delete: " + e.toString());
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<UserPrivilege> getUserPrivileges() {
		return getCurrentSession().createQuery("from UserPrivilege").list();
	}
}
