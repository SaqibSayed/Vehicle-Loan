package com.aditi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aditi.model.Login;
import com.aditi.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	@PostMapping(path = "/save",consumes="application/json")
	@CrossOrigin
	public String saveUser(@RequestBody Login login) {
		
		loginService.saveUser(login);
		
		System.out.println(login);
		
		/*
		 * System.out.println(login); ModelMap map = new ModelMap();
		 * map.addAttribute("id", login.getUserid()); map.addAttribute("pwd",
		 * login.getPassword()); */
		//return new ModelAndView("Data Saved");
		
		return "User Data Saved";
		 
	}
	
	
	@RequestMapping("/verifyuser/{id}/{password}")
	public String verifyUser(@PathVariable("id") int userid, @PathVariable("password") String password) {
		
		String result = loginService.checkUser(userid,password);
		
		return result;
		
	}
	
	@RequestMapping("/getallusers")
	public List<Login> getAllUsers() {
		
		List<Login> users = loginService.getAllUsers();
		
		return users;
		
	}

}
