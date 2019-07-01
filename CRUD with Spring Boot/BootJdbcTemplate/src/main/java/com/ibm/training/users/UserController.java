package com.ibm.training.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/user")
	List<User> getUsers() {
		return service.getUsers();
		
	}
	
	@RequestMapping("/user/{id}")
	String getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	void updateUser(@RequestBody User user, @PathVariable Integer id) {
		service.updateUser(user, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	void deleteUser(@PathVariable Integer id) {
		service.deleteUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user")
	void addUser(@RequestBody User user) {
		service.addUser(user);
	}

}
