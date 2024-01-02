package com.example.BlogApp.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlogApp.dto.CategoryDto;
import com.example.BlogApp.entity.Category;
import com.example.BlogApp.exception.ResourceNotFoundException;
import com.example.BlogApp.repository.CategoryRepository;
import com.example.BlogApp.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ModelMapper modelMpper;
	
	public CategoryDto categoryToDto(Category category) {
		return modelMpper.map(category,CategoryDto.class);
		
		
	}
	public Category dtoToCategory(CategoryDto categoryDto) {
		return modelMpper.map(categoryDto,Category.class);
		
	}

	@Override
	public CategoryDto getCategory(int id) {
		Category category=categoryRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Category","id",id));
		// TODO Auto-generated method stub
		return categoryToDto(category);
		
		
		
		
	}

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		Category category=dtoToCategory(categoryDto);
		
		Category updatedCategory=categoryRepository.save(category);
//		System.out.println(categoryToDto(updatedCategory).getCategoryId());
		return categoryToDto(updatedCategory);
//		categoryDto1.setCategoryId(updatedCategory.getCategoryId());
//		return categoryDto1;
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, int id) {
		// TODO Auto-generated method stub
		
		Category category=categoryRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Category","id",id));
	    category.setTitle(categoryDto.getTitle());
        Category updatedCategory=categoryRepository.save(category);
		
		return categoryToDto(updatedCategory);
	    
	}

	@Override
	public CategoryDto deleteCategory(int id) {
		// TODO Auto-generated method stub
		Category category=categoryRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Category","id",id));
		categoryRepository.deleteById(id);
		return categoryToDto(category);
	   
	}

	

}
