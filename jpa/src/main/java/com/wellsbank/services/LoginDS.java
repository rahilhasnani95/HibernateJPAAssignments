package com.wellsbank.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Login;

public class LoginDS {

	public static void main(String[] args) {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			 EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Login login = new Login();
			
			login.setUserId("rahihaaa");
			login.setPassword("rahil1234");
			login.setRole('A');
			
			em.persist(login);
			
			em.getTransaction().commit();
			System.out.println("persisted");	
		}
		
	}

