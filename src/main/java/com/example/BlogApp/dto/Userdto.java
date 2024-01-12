package com.example.BlogApp.dto;

import java.util.List;

import com.example.BlogApp.entity.Posts;

public class Userdto {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String about;
	private List<Posts> posts;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	public Userdto(Integer id, String name, String username, String password, String about, List<Posts> posts) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.about = about;
		this.posts = posts;
	}
	public List<Posts> getPosts() {
		return posts;
	}
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}
	public Userdto() {
		super();
	}
	
	

}
