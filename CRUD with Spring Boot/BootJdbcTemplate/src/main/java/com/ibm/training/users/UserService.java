package com.ibm.training.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao dao; 
	
	
	List<User> getUsers() {
		
		return dao.getUsers();
	}
	
	String getUser(int id) {
		return dao.getUser(id);
	}

	public void updateUser(User user, Integer id) {
		dao.updateUser(user, id);
		
	}

	public void deleteUser(int id) {
		dao.deleteUser(id);
		
	}

	public void addUser(User user) {
		dao.addUser(user);
		
	}

	
}
