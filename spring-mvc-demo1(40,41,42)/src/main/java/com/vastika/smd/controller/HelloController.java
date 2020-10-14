package com.vastika.smd.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "greet1", method = RequestMethod.GET)
	public ModelAndView greet1() {
		ModelAndView view = new ModelAndView("Hello");
		view.addObject("greet", "Morning");
		return view;
	}

	@RequestMapping(value = "/greet2/{first_name}/{last_name}", method = RequestMethod.GET)
	public ModelAndView greet2(@PathVariable("first_name") String firstName,
			@PathVariable("last_name") String lastName) {
		ModelAndView view = new ModelAndView("greeting");
		view.addObject("greet", "Morning");
		view.addObject("msg", firstName + " " + lastName + "Hello from spring Hello worldCondtroller");
		return view;
	}

	@RequestMapping(value = "/greet3/{first_name}/{last_name}", method = RequestMethod.GET)
	public ModelAndView greet2(@PathVariable Map<String, String> info) {
		ModelAndView view = new ModelAndView("greeting");
		view.addObject("greet", "Morning");
		view.addObject("msg",info.get("first_name") + info.get("last_name") + "Hello from spring Hello worldCondtroller");
		return view;

	}

	@RequestMapping(value = "/greet4", method = RequestMethod.GET)
	public ModelAndView greet4(@RequestParam ("first_name") String firstName, @RequestParam String lastName) {
		ModelAndView view = new ModelAndView("greeting");
		view.addObject("greet", "Morning");
		view.addObject("msg", firstName +" "+ lastName + "Hello from spring Hello worldCondtroller");
		return view;
	}

	@RequestMapping(value = "/greet5", method = RequestMethod.GET)
	public ModelAndView greet5(@RequestParam Map<String, String> info) {
		ModelAndView view = new ModelAndView("greeting");
		view.addObject("greet", "Morning");
		view.addObject("msg",
				info.get("first_name") +" "+ info.get("lastName") + "Hello from spring Hello worldCondtroller");
		return view;
	}
	public Model addCommonObject(Model model) {
		model.addAttribute("greet,Good Morning");
		return model;
	}
}
