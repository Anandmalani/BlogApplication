package com.example.BlogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApp.entity.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
