package com.wellsbank.entities;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import com.wellsbank.services.LoginListener;

@Entity
@EntityListeners(LoginListener.class)
public class Login {

	@Id
	private String userId;
	private String password;
	private char role;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getRole() {
		return role;
	}
	public void setRole(char role) {
		this.role = role;
	}
	
	
}
