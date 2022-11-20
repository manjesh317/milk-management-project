package com.pro.milkmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.milkmanagement.entity.Milk;
import com.pro.milkmanagement.repository.MilkRepository;

@Service
public class MilkService {
	@Autowired
	public MilkRepository milkRepository;
	
	public List<Milk> getMilks() {
		List<Milk> milks = milkRepository.findAll();
		for(Milk milk:milks) {
			System.out.println(milk);
		}
		return milks;
	}

	public void createMilk(Milk milk) {
		milkRepository.save(milk);
		
	}

	public Optional<Milk> getMilk(Long id) {
		return milkRepository.findById(id);
	}
	
	public Milk updateMilk(Milk milk) {
		return milkRepository.save(milk);
	}

	public void removeMilk(Long id) {
		milkRepository.deleteById(id);		
	}


}
