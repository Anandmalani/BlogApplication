package com.example.BlogApp.service;

import java.util.List;
import java.util.Optional;


import com.example.BlogApp.dto.Userdto;
import com.example.BlogApp.entity.Userr;

public interface UserService {
	
	Userdto createUser(Userdto user);
	Userdto updateUser(Userdto user, int id);
	Userdto getUser(int id);
	void deleteUser(int id);
//	List<Userdto> getUsers();

}
