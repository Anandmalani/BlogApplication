package com.example.BlogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApp.entity.Role;




@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRoleName(String string);

}
