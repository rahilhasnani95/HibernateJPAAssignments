package com.vehicle.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vehicle.entities.Vehicle14;

public class Vehicle14DS {

	public static void main(String[] args) {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Vehicle14 myvehicle = new Vehicle14();
			myvehicle.setVehicleId(1001);
			myvehicle.setOwnerId(109);
			myvehicle.setName("WagonR");
			myvehicle.setPrice(500000);
			
			em.persist(myvehicle);
			
			em.getTransaction().commit();
		
		
	}
	
}
