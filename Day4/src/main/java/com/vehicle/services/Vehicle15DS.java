package com.vehicle.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vehicle.entities.Vehicle14;
import com.vehicle.entities.VehiclePK;

public class Vehicle15DS {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		VehiclePK pk = new VehiclePK();
		pk.setOwnerId(101);
		pk.setVehicleId(1001);
		
		Vehicle14 myvehicle = em.find(Vehicle14.class, pk);
		
		if(myvehicle == null)
		{
			System.out.println("Cound not find entity. Invalid key");
		}
		else
		{
			System.out.println(myvehicle.getName());
			System.out.println(myvehicle.getPrice());
		}
		
		em.getTransaction().commit();
	
	
}
	
}
