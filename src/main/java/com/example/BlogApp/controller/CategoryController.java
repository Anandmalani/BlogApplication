package com.example.BlogApp.controller;

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

import com.example.BlogApp.dto.CategoryDto;
import com.example.BlogApp.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer id) {
		CategoryDto categoryDto=categoryService.getCategory(id);
		return new ResponseEntity<>(categoryDto, HttpStatus.OK);
		
		
	}
	@PostMapping
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
		CategoryDto categoryDto1=categoryService.createCategory(categoryDto);
		return new ResponseEntity<>(categoryDto1, HttpStatus.OK);
		
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable Integer id) {
		CategoryDto categoryDto1=categoryService.updateCategory(categoryDto, id);
		return new ResponseEntity<>(categoryDto1, HttpStatus.OK);
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteeCategory(@PathVariable Integer id) {
		categoryService.deleteCategory(id);
		return new ResponseEntity<>("category deleted successfully", HttpStatus.OK);
		
		
	}
	

}
