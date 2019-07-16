package com.wellsbank.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Customer;

public class CustomerDSRemove {

	public static void main(String[] args) {
		EntityManager em = null;
		ReadData readdata = new ReadData();

		System.out.println("Enter customer id");
		int custId = Integer.parseInt(readdata.acceptString()); 
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();

			em.getTransaction().begin();

			Customer c = em.find(Customer.class, custId);
			
			if(c!=null)
			{
				em.remove(c);
				System.out.println("Cusyomer removed");
			}
			else
			{
				System.out.println("Invalid Customer id");
			}

			em.getTransaction().commit();
		}
		finally
		{
			em.close();
		}

	}


	
}
