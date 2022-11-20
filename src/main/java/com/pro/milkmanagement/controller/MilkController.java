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

import com.pro.milkmanagement.entity.Milk;
import com.pro.milkmanagement.service.MilkService;

@RestController
@RequestMapping("milk")
public class MilkController {
	@Autowired
	public MilkService milkService;
	
	
	
	@GetMapping("/milk")
	public List<Milk> getMilks() {
		return milkService.getMilks(); 
	}
	
	@GetMapping("/milk/{id}")
	public Optional<Milk> getMilk(@PathVariable Long id) {
		return milkService.getMilk(id); 
	}
	
	@PostMapping("/milk")
	public void createMilk(@RequestBody Milk milk) {
		milkService.createMilk(milk);
	}
	
	@PutMapping("/milk/{id}")
	public Milk updateMilk(@PathVariable Long id, @RequestBody Milk milk) {
		milk.setId(id);
		return milkService.updateMilk(milk);
	}
	
	@DeleteMapping("/milk/{id}")
	public void removeMilk(@PathVariable Long id) {
		milkService.removeMilk(id);
	}

}
