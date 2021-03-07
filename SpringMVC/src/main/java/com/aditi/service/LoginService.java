package com.aditi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.dao.LoginDao;
import com.aditi.model.Login;


@Service
public class LoginService {
	
	@Autowired
	private LoginDao dao;
	
	public String checkUser(int userid, String password) {
		Login login = dao.getUser(userid);
		if(login==null) {
			return "User not Found";
		}
		
		return "Welcome " + login.getName();
	}

	public void saveUser(Login login) {
		dao.saveUser(login);
		
	}

	public List<Login> getAllUsers() {
		List<Login> users = dao.getAllUsers();
		return users;
	}

	

}
