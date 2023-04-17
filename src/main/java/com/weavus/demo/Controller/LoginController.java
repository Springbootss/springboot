package com.weavus.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String init() {
		return "login";
		
	}
	@RequestMapping("login")
	public String login(Model model, String id,String password) {
		model.addAttribute("id", id);
		if (id.equals("123")&&password.equals("123"))
			return "main";
		else
			return "login";
	}

	
	
	@RequestMapping("logout")
	public String logout() {
		return "login";
}
	
	@RequestMapping("modify")
	public String modify() {
		return "modify";
}
	
	@RequestMapping("update")
	public String update() {
		return "main";
}
	@RequestMapping("register")
	public String register() {
		return "register";
}
	
	
	
}
	
	
	


