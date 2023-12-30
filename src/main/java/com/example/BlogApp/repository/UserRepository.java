package com.example.BlogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApp.entity.Userr;

@Repository
public interface UserRepository extends JpaRepository<Userr, Integer>{

}
