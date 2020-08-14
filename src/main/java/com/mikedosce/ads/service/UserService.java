package com.mikedosce.ads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikedosce.ads.repository.UserRepository;
import com.mikedosce.ads.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;	
	
	public void save(User user) {		
		repository.save(user);
	}
	
	public List<User> getUsers(){
		return repository.findAll();
	}
}
