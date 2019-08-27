package com.example.Assigment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assigment.Repository.UserRepository;
import com.example.Assigment.model.User;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepository;

	public boolean validateUser(User user) {
		// in28minutes, dummy
		User user2 = new User();
		user.setPhone(user.getPhone());
		user.setEmail(user.getEmail());
		try {
			user2 = userRepository.save(user);
		} catch (Exception e) {

		}
		return (user2.getEmail() != null && user2.getPhone() != null);
	}

	public boolean checkUser(User user) {
		User users = userRepository.findByphoneAndEmail(user.getPhone(), user.getEmail());
		if (users != null && users.getId() != null) {

			return true;
		}
		return false;
	}

}
