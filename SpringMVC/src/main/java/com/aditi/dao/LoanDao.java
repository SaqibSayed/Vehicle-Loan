package com.aditi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aditi.model.LoanDetails;
import com.aditi.model.UserDetails;
import com.aditi.repo.LoanRepository;

@Repository
public class LoanDao {

	@Autowired
	private LoanRepository loanrepo;
	
	public List<LoanDetails> getAllLoans(String status) {
		List<LoanDetails> users = loanrepo.findAll();
		return users;
	}

	public List<LoanDetails> findAll() {
		return loanrepo.findAll();
	}
	
}
