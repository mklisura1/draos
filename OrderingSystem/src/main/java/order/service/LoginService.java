package order.service;

import order.model.User;

public interface LoginService {

	public User getUserByUsername(String username);
}
