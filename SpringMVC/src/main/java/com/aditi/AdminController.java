package com.aditi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.model.LoanDetails;
import com.aditi.model.UserDetails;
import com.aditi.service.LoanService;
import com.aditi.service.UserService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
@ComponentScan("com.aditi")
public class AdminController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoanService loanService;
	
	@RequestMapping("/getallloans/{status}")
	public List<LoanDetails> getAllLoans(@PathVariable("status") String status) {
		System.out.println(status);
		return  loanService.getAllLoans(status);
		
		
	}
}
