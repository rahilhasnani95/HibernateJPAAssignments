package com.wellsbank.services;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Brand;

public class BrandDS {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		try
		{
			em.getTransaction().begin();

			Brand brand = new Brand();
			brand.setBrandid(103);
			brand.setBrandname("Indigonation");
			brand.setDateoflaunch(new GregorianCalendar(2008,04,23));

			em.persist(brand);

			em.getTransaction().commit();
			System.out.println("persisted");
		}
		finally
		{
			em.close();
		}
	}
	
	
}
