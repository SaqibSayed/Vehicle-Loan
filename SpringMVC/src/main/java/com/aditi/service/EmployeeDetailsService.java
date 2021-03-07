package com.aditi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.dao.EmployeeDetailsDao;
import com.aditi.model.EmployeeDetails;
import com.aditi.model.UserDetails;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsDao employeeDetailsDao;
	
	public void saveEmpDets(EmployeeDetails empdetails) {
		employeeDetailsDao.saveUser(empdetails);	
		
	}

}
