package com.vehicle.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vehicle.entities.Vehicle;

public class VehicleDS {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Vehicle v = new Vehicle();
			v.setOwnerId(600);
			v.setName("BMW");
			v.setPrice(9990000.0);
			
			em.persist(v);
			
			em.getTransaction().commit();
			
			System.out.println("Generated Vehicle Id: " + v.getVehicleId());
		}
		finally
		{
			em.close();
		}
		
		
	}
	
}
