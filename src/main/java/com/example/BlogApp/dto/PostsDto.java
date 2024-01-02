package com.example.BlogApp.dto;

import com.example.BlogApp.entity.Category;
import com.example.BlogApp.entity.Userr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor   
@AllArgsConstructor 
public class PostsDto {
	private Integer postId;
	private String postTitle;
	private Userr user;
	private Category category;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public Userr getUser() {
		return user;
	}
	public void setUser(Userr user) {
		this.user = user;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
