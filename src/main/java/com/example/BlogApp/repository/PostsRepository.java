package com.example.BlogApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApp.entity.Posts;
import com.example.BlogApp.entity.Userr;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer> {

	

}
