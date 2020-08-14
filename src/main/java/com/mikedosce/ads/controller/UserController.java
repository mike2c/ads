package com.mikedosce.ads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikedosce.ads.model.User;
import com.mikedosce.ads.service.UserService;

@RestController
@RequestMapping("/api-v1")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		
		return service.getUsers();
	}
}
