package com.vastika.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vastika.sm.model.User;

@Controller
public class User1Controller {
@RequestMapping(value="/")
public String getUserForm() {
	return "createUser";
}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user, Model model) {
		System.out.println("user name is"+user.getUserName());
		System.out.println("password is"+ user.getPassword());
		System.out.println("email is"+user.getEmail());
		System.out.println("mobile no is"+user.getMobileNo());
		model.addAttribute("user",user);
		return "listUser";
		
	
}
}
