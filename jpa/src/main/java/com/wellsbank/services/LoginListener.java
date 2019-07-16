package com.wellsbank.services;

import javax.persistence.PostPersist;

import com.wellsbank.entities.Login;

public class LoginListener {

	@PostPersist
	public void afterPersist(Login l)
	{
		System.out.println("Entity is  persisted");
		
	}
	
	
}
