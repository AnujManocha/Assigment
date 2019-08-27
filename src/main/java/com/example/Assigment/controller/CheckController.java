package com.example.Assigment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Assigment.model.User;
import com.example.Assigment.service.LoginService;

@Controller
public class CheckController {
	@Autowired
	LoginService service;

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String emailid, @RequestParam String phone) {
		User user = new User();
		user.setEmail(emailid);
		user.setPhone(phone);

		boolean isValidUser = service.checkUser(user);
		if (!isValidUser) {
			model.addAttribute("errorMessage", "User doesn't exists");
			return "check";
		}
		model.addAttribute("successMessage", "User exists " + emailid);
		return "check";
	}
}
