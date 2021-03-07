package com.aditi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aditi.model.Login;
import com.aditi.repo.LoginRepository;

@Repository
public class LoginDao {
	
	@Autowired
	private LoginRepository loginrepo;
	
	/*
	 * public void getUser(int userid) {
	 * System.out.println(loginrepo.existsById(userid)); List<Login> l =
	 * loginrepo.findAll(); System.out.println(l.get(1)); System.out.println(userid
	 * + " is ok"); }
	 */
	
	public Login getUser(int userid) {
		Optional<Login> loginOpt = loginrepo.findById(userid);
		boolean res = loginOpt.isPresent();
		Login login = null;
		if(res) {
			login = loginOpt.get();
		}
		System.out.println(login);
		return login;
	}

	public void saveUser(Login login) {
		
		/*
		 * if(loginrepo.existsById(login.getUserid())) {
		 * System.out.println("User Already Exists"); } else {
		 */
		loginrepo.save(login);
		System.out.println("Saved");
		//}
	}

	public List<Login> getAllUsers() {
		List<Login> users = loginrepo.findAll();
		return users;
	}
	
}
