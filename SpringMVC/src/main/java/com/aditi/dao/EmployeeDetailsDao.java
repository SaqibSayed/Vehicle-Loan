package com.aditi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aditi.model.EmployeeDetails;
import com.aditi.repo.EmployeeDetailsRepository;

@Repository
@Transactional
public class EmployeeDetailsDao {

	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	
	public void saveUser(EmployeeDetails empdetails) {
		employeeDetailsRepository.save(empdetails);
		System.out.println("Saved");
		
	}

}
