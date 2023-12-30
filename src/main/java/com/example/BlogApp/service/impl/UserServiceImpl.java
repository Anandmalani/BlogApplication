package com.example.BlogApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlogApp.entity.Userr;
import com.example.BlogApp.exception.ResourceNotFoundException;
import com.example.BlogApp.repository.UserRepository;
import com.example.BlogApp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Userr createUser(Userr user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
//		return null;
	}

	@Override
	public Userr updateUser(Userr user, int id) {
		// TODO Auto-generated method stub
		Userr user1=userRepository.findById(id)
		       .orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		user1.setName(user.getName());
		user1.setPassword(user.getPassword());
		user1.setUsername(user.getUsername());
		user1.setAbout(user.getAbout());
		 userRepository.save(user1);
		return user1;
	}

	@Override
	public Userr getUser( int id) {
		// TODO Auto-generated method stub
		Userr user=userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		return user;
	}

	@Override
	public Userr deleteUser(int id) {
		// TODO Auto-generated method stub
		Userr user=userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		userRepository.deleteById(id);
		return user;
		
	}

	@Override
	public List<Userr> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
//		return null;
	}

}
