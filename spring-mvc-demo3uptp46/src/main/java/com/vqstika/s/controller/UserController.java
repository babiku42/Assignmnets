package com.vqstika.s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vqstika.sm.model.User1;
import com.vqstika.sm.service.UserService;

@Controller
public class UserController {
	@Autowired 
	private UserService userService;
@RequestMapping(value="/user_form")
public String getUserForm() {
	return "createUser1";
	
}
@RequestMapping(value="/user_edit")  
public String getUserEditForm(@RequestParam int id,  Model model) {
	model.addAttribute("user", userService.getUserById(id));
	return "editUser";
}
@RequestMapping(value="user_save", method=RequestMethod.POST)
public String saveUser(@ModelAttribute User1 user, Model model) {
	userService.saveUser(user);
	return "redirect:/user_list";
	
}

@RequestMapping(value="/user_update", method=RequestMethod.POST)
public String updateUser(@ModelAttribute User1 user, Model model) {
	userService.updateUser(user);
	return "redirect:/user_list";
}
@RequestMapping(value="/user_delete", method=RequestMethod.GET)
public String deleteUser(@RequestParam int id) {
	userService.deleteUser(id);
	return "redirect:/user_list";
}
@RequestMapping(value={"/","/user_list"}, method=RequestMethod.GET)
public String getAllUser(Model model) {
	model.addAttribute("users", userService.getAllUser());
	return "list1";

}
}
//System.out.println("user name is"+user.getUserName());
//System.out.println("password is"+ user.getPassword());
//System.out.println("email is"+user.getEmail());
//System.out.println("mobile no is"+user.getMobileNo());
//System.out.println("nationality is"+ user.getNationality());
//System.out.println("cityname is "+ user.getAddress());
//System.out.println("gender is"+ user.getGender());
//System.out.println("date of birth is"+user.getDob());
//System.out.println("hobbies"+ user.getHobbies());
//System.out.println(user.getComments());
//model.addAttribute("user", user);
//return "list1";
