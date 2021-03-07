package com.aditi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.model.EmployeeDetails;
import com.aditi.service.EmployeeDetailsService;

@RestController
@RequestMapping("/emp_dets")
@CrossOrigin
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService employeeDetailsService;
	
	@PostMapping(path = "/save",consumes="application/json")
	@CrossOrigin
	public String saveEmpDets(@RequestBody EmployeeDetails empdetails) {
		
		employeeDetailsService.saveEmpDets(empdetails);
		
		System.out.println(empdetails);
		
		return "Employee Data Saved";
		 
	}
}
