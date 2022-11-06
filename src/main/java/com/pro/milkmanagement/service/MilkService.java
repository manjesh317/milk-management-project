package com.pro.milkmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.milkmanagement.entity.User;
import com.pro.milkmanagement.repository.MilkRepository;

@Service
public class MilkService {
	@Autowired
	public MilkRepository milkRepository;
	
	public List<User> getUsers() {
		List<User> users = milkRepository.findAll();
		for(User user:users) {
			System.out.println(user);
		}
		return users;
	}

	public void createUser(User user) {
		milkRepository.save(user);
		
	}

	public Optional<User> getUser(Long id) {
		return milkRepository.findById(id);
	}
	
	public User updateUser(User user) {
		return milkRepository.save(user);
	}

	public void removeUser(Long id) {
		milkRepository.deleteById(id);		
	}

}
