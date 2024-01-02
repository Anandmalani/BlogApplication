package com.example.BlogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApp.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
