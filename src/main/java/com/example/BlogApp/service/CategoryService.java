package com.example.BlogApp.service;

import com.example.BlogApp.dto.CategoryDto;

public interface CategoryService {
	 CategoryDto getCategory(int id);
	 CategoryDto createCategory(CategoryDto categoryDto);
	 CategoryDto updateCategory(CategoryDto categoryDto, int id);
	 CategoryDto deleteCategory(int id);
	

}
