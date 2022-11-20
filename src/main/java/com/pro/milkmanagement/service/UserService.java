package com.pro.milkmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.milkmanagement.entity.User;
import com.pro.milkmanagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;
	
	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		for(User user:users) {
			System.out.println(user);
		}
		return users;
	}

	public void createUser(User user) {
		userRepository.save(user);
		
	}

	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public void removeUser(Long id) {
		userRepository.deleteById(id);		
	}

}
