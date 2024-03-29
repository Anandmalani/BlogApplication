package com.example.BlogApp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.BlogApp.dto.Userdto;
import com.example.BlogApp.entity.Role;
import com.example.BlogApp.entity.Userr;
import com.example.BlogApp.exception.ResourceNotFoundException;
import com.example.BlogApp.repository.RoleRepository;
import com.example.BlogApp.repository.UserRepository;
import com.example.BlogApp.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private  PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepository roleRepository;
	
	public Userdto userToUserdto(Userr user) {
		return modelMapper.map(user, Userdto.class);		
	}
	public Userr userdtoToUser(Userdto userdto) {
		return modelMapper.map(userdto, Userr.class);	
		
	}

	@Override
	public Userdto createUser(Userdto userdto) {
		if (userRepository.existsByUsername(userdto.getUsername())) {
            return null;
        }
		 String hashPassword = passwordEncoder.encode(userdto.getPassword());
	       userdto.setPassword(hashPassword);
	       Userr user=userdtoToUser(userdto);
	       
	       //set role
	       List<Role> roles = new ArrayList<>();
	    	Role userRole = roleRepository.findByRoleName("USER");
	    	if (userRole == null) {
	    	    userRole = new Role();
	    	    userRole.setRoleName("USER");
	    	    
	    	}
	    	roles.add(userRole);
	    	user.setRoles(roles);
	    	userRepository.save(user);
//	       userdto.setId(user.getId());
	       Userdto userdto1=userToUserdto(user);

//	      
		 return userdto1;
//		return null;
	}

	@Override
	public Userdto updateUser(Userdto userdto, int id) {
		// TODO Auto-generated method stub
		Userr user1=userRepository.findById(id)
		       .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		user1.setName(userdto.getName());
		user1.setPassword(userdto.getPassword());
		user1.setUsername(userdto.getUsername());
		user1.setAbout(userdto.getAbout());
//		Userr user2=modelMapper.map(userdto, Userr.class);
		Userr user2=userRepository.save(user1);
		return modelMapper.map(user2, Userdto.class);
//		return user1;
	}

	@Override
	public Userdto getUser( int id) {
		// TODO Auto-generated method stub
		Userr user=userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		return modelMapper.map(user, Userdto.class);
	}
	public Userr getUser1( int id) {
		// TODO Auto-generated method stub
		Userr user=userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Userr user=userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Userr", "id", id));
		userRepository.deleteById(id);
		
		
	}

//	@Override
//	public List<Userdto> getUsers() {
//		// TODO Auto-generated method stub
//		return userRepository.findAll();
////		return null;
	
//	}

}
