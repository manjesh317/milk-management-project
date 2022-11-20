package com.pro.milkmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.milkmanagement.entity.MilkMan;
import com.pro.milkmanagement.service.MilkManService;

@RestController
@RequestMapping("milk")
public class MilkManController {
	@Autowired
	public MilkManService milkManService;
	
	
	
	@GetMapping("/milkman")
	public List<MilkMan> getMilkMans() {
		return milkManService.getMilkMans(); 
	}
	
	@GetMapping("/milkman/{id}")
	public Optional<MilkMan> getMilkMan(@PathVariable Long id) {
		return milkManService.getMilkMan(id); 
	}
	
	@PostMapping("/milkman")
	public void createUser(@RequestBody MilkMan milkMan) {
		milkManService.createMilkMan(milkMan);
	}
	
	@PutMapping("/milkman/{id}")
	public MilkMan updateMilkMan(@PathVariable Long id, @RequestBody MilkMan milkMan) {
		milkMan.setId(id);
		return milkManService.updateMilkMan(milkMan);
	}
	
	@DeleteMapping("/milkman/{id}")
	public void removeMilkMan(@PathVariable Long id) {
		milkManService.removeMilkMan(id);
	}
}
