package com.pro.milkmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.milkmanagement.entity.User;

@Repository
public interface MilkRepository extends JpaRepository<User, Long> {
	
}
