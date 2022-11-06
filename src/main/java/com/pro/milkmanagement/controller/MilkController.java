package com.pro.milkmanagement.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.milkmanagement.entity.User;
import com.pro.milkmanagement.service.MilkService;

@RestController
@RequestMapping("milk")
public class MilkController {
	
	@Autowired
	public MilkService milkService;
	
	
	
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
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return milkService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void removeUser(@PathVariable Long id) {
		milkService.removeUser(id);
	}
	
}
