package com.pro.milkmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.milkmanagement.entity.MilkMan;
import com.pro.milkmanagement.repository.MilkManRepository;

@Service
public class MilkManService {
	@Autowired
	public MilkManRepository milkManRepository;
	
	public List<MilkMan> getMilkMans() {
		List<MilkMan> milkmans = milkManRepository.findAll();
		for(MilkMan milkman:milkmans) {
			System.out.println(milkman);
		}
		return milkmans;
	}

	public void createMilkMan(MilkMan milkman) {
		milkManRepository.save(milkman);
		
	}

	public Optional<MilkMan> getMilkMan(Long id) {
		return milkManRepository.findById(id);
	}
	
	public MilkMan updateMilkMan(MilkMan milkMan) {
		return milkManRepository.save(milkMan);
	}

	public void removeMilkMan(Long id) {
		milkManRepository.deleteById(id);		
	}

}
