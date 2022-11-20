package com.pro.milkmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.milkmanagement.entity.Milk;

public interface MilkRepository extends JpaRepository<Milk, Long> {

}
