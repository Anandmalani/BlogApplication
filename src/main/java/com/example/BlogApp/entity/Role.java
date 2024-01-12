package com.example.BlogApp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer roleId;
	@Column(unique = true)
	private String roleName;
	
	@ManyToMany(mappedBy = "roles")
	private List<Userr> users;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Userr> getUsers() {
		return users;
	}

	public void setUsers(List<Userr> users) {
		this.users = users;
	}

	public Role(Integer roleId, String roleName, List<Userr> users) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.users = users;
	}

	public Role() {
		super();
	}
	
	
	
	
	
	

	

}
