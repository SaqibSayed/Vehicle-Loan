package com.aditi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditi.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer>{

}
