package com.pro.milkmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.milkmanagement.entity.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

}