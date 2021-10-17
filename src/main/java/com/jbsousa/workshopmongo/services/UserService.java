package com.jbsousa.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbsousa.workshopmongo.domain.User;
import com.jbsousa.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
