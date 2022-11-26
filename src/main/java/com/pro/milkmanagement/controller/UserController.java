package com.pro.milkmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.milkmanagement.entity.User;
import com.pro.milkmanagement.service.UserService;

@RestController
@RequestMapping("milk")
public class UserController {
	
	@Autowired
	public UserService milkService;
	
			
	@GetMapping("/user")	
	public List<User> getUsers() {
		return milkService.getUsers(); 
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return milkService.getUser(id); 
	}
	
	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		milkService.createUser(user);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		user.setId(id);
		return milkService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void removeUser(@PathVariable Long id) {
		milkService.removeUser(id);
	}
	
}
