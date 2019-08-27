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
public class LoginController {
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String emailid, @RequestParam String phone) {
		User user = new User();
		user.setEmail(emailid);
		user.setPhone(phone);
		boolean isValidUser = service.validateUser(user);
		if (!isValidUser) {
			model.put("errorMessage", "Failed to add user . User already exists");
			return "login";
		}
		model.put("emailid", user.getEmail());
		model.put("password", user.getPhone());
		return "welcome";
	}
}
