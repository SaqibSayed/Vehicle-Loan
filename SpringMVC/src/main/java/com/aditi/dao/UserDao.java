package com.aditi.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aditi.model.Login;
import com.aditi.model.UserDetails;
import com.aditi.repo.UserRepository;

@Repository
@Transactional
public class UserDao {

	@Autowired
	private UserRepository userrepo;
	
	public void saveUser(UserDetails user) {
		/*
		 * if(loginrepo.existsById(login.getUserid())) {
		 * System.out.println("User Already Exists"); } else {
		 */
		userrepo.save(user);
		System.out.println("Saved");
		//}
		
	}

//	public UserDetails getUser(String email_id) {
//		Optional<UserDetails> loginOpt = userrepo.findById(email_id);
//		boolean res = loginOpt.isPresent();
//		UserDetails login = null;
//		//UserDetails user = loginOpt.get();
//		//String res2 = user.getPassword();
//		if(res) {
//			login = loginOpt.get();
//		}
//		System.out.println(login);
//		return login;
//	}

	public List<UserDetails> getAllUsers() {
		List<UserDetails> users = userrepo.findAll();
		return users;
	}

	public void updateUser(UserDetails updatedUser) {
		if(userrepo.existsById(updatedUser.getUser_id())) {
			userrepo.save(updatedUser);
        } else {
            System.out.println("Trying to update a user which doesn't exist.");
        }
	}

	public void deleteUser(int id) {
		userrepo.deleteById(id);
	}
}
