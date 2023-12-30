package com.example.BlogApp.service;

import java.util.List;
import java.util.Optional;

import com.example.BlogApp.entity.Userr;

public interface UserService {
	
	Userr createUser(Userr user);
	Userr updateUser(Userr user, int id);
	Userr getUser(int id);
	Userr deleteUser(int id);
	List<Userr> getUsers();

}
