package com.example.BlogApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogApp.dto.Userdto;
import com.example.BlogApp.entity.Userr;
import com.example.BlogApp.exception.ResourceNotFoundException;
import com.example.BlogApp.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/signup")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody Userdto user) {
//	     return userServiceImpl.createUser(user);
//	     return new ResponseEntity<>(user1,HttpStatus.CREATED);
	     Userdto createdUser = userServiceImpl.createUser(user);
	        if (createdUser != null) {
	            return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	        } else {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create customer");
	      }
		
		
	}
	@GetMapping("/{id}")
	public Userdto getUser(@PathVariable Integer id) {
		return userServiceImpl.getUser(id);
//		return new ResponseEntity(user, HttpStatus.OK);
				
		
		
	}
//	@GetMapping("/{uersId}/posts")
//	public void getPostsOfSpecificUser(@PathVariable Integer userId) {
//		Userr user=userServiceImpl.getUser1(userId);
//		
//		
//	}
	@PutMapping("/{id}")
	public Userdto updateUser( @RequestBody Userdto user,@PathVariable Integer id) {
		return userServiceImpl.updateUser( user,id);
//		return new ResponseEntity(user1, HttpStatus.OK);
		
		
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userServiceImpl.deleteUser(id);
//		return new ResponseEntity(user1, HttpStatus.OK);
		
	}
//	@GetMapping
//	public ResponseEntity<Userr> getAllUsers() {
//		List<Userr> users=userServiceImpl.getUsers();
//		return new ResponseEntity(users, HttpStatus.OK);
//		
//	}


}
