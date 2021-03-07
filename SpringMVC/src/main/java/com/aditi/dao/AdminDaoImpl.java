package com.aditi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aditi.model.Admin;
import com.aditi.model.UserDetails;
import com.aditi.repo.AdminRepository;
import com.aditi.repo.UserRepository;

@Repository
@Transactional
@EnableJpaRepositories("com.aditi.repo")
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private AdminRepository repository;
	
	@Autowired
	private UserRepository userrepository;
	
	@Override
	public Admin checkPassword(int adminLoginId) {
		Optional<Admin> loginOpt = repository.findById(adminLoginId);
		boolean res = loginOpt.isPresent();
		Admin login = null;
		if(res) {
			login = loginOpt.get();
		}
		System.out.println(login);
		return login;
	}

	@Override
	public List<UserDetails> fetchUser(String status) {
		List<UserDetails> userlist = userrepository.fetchAllUser(status);
		return userlist;
	}

}
