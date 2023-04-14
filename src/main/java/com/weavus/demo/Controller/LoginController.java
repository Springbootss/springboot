package com.weavus.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String home() {
		
		
		return "home";
		
	
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("name", "tam");
		
		
		
		
		return "login";
	}

	

}
