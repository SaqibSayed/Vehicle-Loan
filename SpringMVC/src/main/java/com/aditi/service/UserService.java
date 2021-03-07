package com.aditi.service;

import java.util.HashMap;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.dao.UserDao;
import com.aditi.model.Login;
import com.aditi.model.UserDetails;
import com.aditi.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	@Autowired
	private UserRepository userrepo;
	
	public void saveUser(UserDetails user) {
		dao.saveUser(user);	
	}
	
	public HashMap<String, Object> checkUser(String email_id, String password) {
		UserDetails userDetails = userrepo.findUserByEmail(email_id);
        if(userDetails != null && userDetails.getPassword().equals(password)) {

        	HashMap<String, Object> map = new HashMap<>();
    		map.put("user_id", userDetails.getUser_id());
    		map.put("role", userDetails.getRole());
    		map.put("status","1");
    		return map;
        }
        
        HashMap<String, Object> map = new HashMap<>();
        		map.put("status","0");
        		return map;
		
	}
	
	public List<UserDetails> getAllUsers() {
		List<UserDetails> users = dao.getAllUsers();
		return users;
	}

	public void updateUser(UserDetails updatedUser) {
		dao.updateUser(updatedUser);
	}

	public void deleteUser(int id) {
		dao.deleteUser(id);
		
	}

}
