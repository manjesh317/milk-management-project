package com.pro.milkmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.milkmanagement.entity.MilkMan;

@Repository
public interface MilkManRepository extends JpaRepository<MilkMan, Long> {

}
