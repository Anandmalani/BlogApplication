package com.example.BlogApp.dto;

import java.util.List;

import com.example.BlogApp.entity.Posts;

public class CategoryDto {
	private Integer categoryId;
	private String title;
	private List<Posts> posts;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public CategoryDto(Integer categoryId, String title, List<Posts> posts) {
		super();
		this.categoryId = categoryId;
		this.title = title;
		this.posts = posts;
	}
	public List<Posts> getPosts() {
		return posts;
	}
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}
	public CategoryDto() {
		super();
	}
	
	
	

}
