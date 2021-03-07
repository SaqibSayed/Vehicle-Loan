package com.aditi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aditi.model.Login;
import com.aditi.model.UserDetails;

@Controller
public class Test1 {
	
	@RequestMapping("/testpage1")
	public ModelAndView testpage1() {
		
		Map<String, String> mp = new HashMap();
		mp.put("name", "Aditi Ambre");
		ModelAndView mv = new ModelAndView("testpage1","command",new UserDetails());
		
		return mv;
	}

	@RequestMapping("/testpage2")
	public String testpage2() {
		
		return "testpage2";
	}
	
}
