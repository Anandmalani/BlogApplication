package com.example.BlogApp.dto;

public class CategoryDto {
	private Integer categoryId;
	private String title;
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
	public CategoryDto(Integer categoryId, String title) {
		super();
		this.categoryId = categoryId;
		this.title = title;
	}
	public CategoryDto() {
		super();
	}
	
	
	

}
