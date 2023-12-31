package com.example.BlogApp.dto;

public class Userdto {
	private String name;
	private String username;
	private String password;
	private String about;
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
	public Userdto(String name, String username, String password, String about) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.about = about;
	}
	public Userdto() {
		super();
	}
	

}
