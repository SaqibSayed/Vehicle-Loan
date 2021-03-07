package com.aditi;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditi.model.Login;
import com.aditi.model.UserDetails;
import com.aditi.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping(path = "/save",consumes="application/json")
	@CrossOrigin
	public String saveUser(@RequestBody UserDetails user) {
		
		userService.saveUser(user);
		
		System.out.println(user);
		
		return "User Data Saved";
		 
	}
	
	@RequestMapping("/verifyuser/{email_id}/{password}")
	public HashMap<String, Object> verifyUser(@PathVariable("email_id") String email_id, @PathVariable("password") String password) {
		
		return userService.checkUser(email_id,password);
		
	
		
	}
	
	 @PutMapping
	    public void update(@RequestBody UserDetails updatedUser) {
	        userService.updateUser(updatedUser);
	    }


	  @DeleteMapping(path = "/{id}")
	    public void delete(@PathVariable int id) {
	        userService.deleteUser(id);
	    }
	 
	@RequestMapping("/getallusers")
	public List<UserDetails> getAllUsers() {
		
		List<UserDetails> users = userService.getAllUsers();
		
		return users;
		
	}
}
