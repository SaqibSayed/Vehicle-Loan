package com.aditi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.dao.LoanDao;
import com.aditi.model.LoanDetails;
import com.aditi.model.UserDetails;
import com.aditi.repo.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanDao dao;
		
	@Autowired
	private LoanRepository loanrepo;

	public List<LoanDetails> getAllLoans(String status) {
		
		return dao.findAll();
	}
	
	
	
}
