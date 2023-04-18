package com.weavus.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weavus.demo.Entity.Member;
import com.weavus.demo.dao.MemberRepository;

@Controller
public class LoginController {
	
	@Autowired
	MemberRepository repo;
	
	
	
	@RequestMapping("/")
	public String init() {
		return "login"; 
		
	}
	
	
	@RequestMapping("login")
	public String login(Model model,int id,String password) {
		
		//select * from Member Where id=id
		Member result=repo.findByIdAndPw(id,password);
		Iterable <Member> resultlist=repo.findAll();
		
		
		model.addAttribute("member", result);
		model.addAttribute("memberlist", resultlist);
		
		
		
		return "main";
		
		
//		if (id==123&&password.equals("123"))
//			return "main";
//		else
//			return "login";
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
	
	
	


