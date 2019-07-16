package com.wellsbank.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersist {

	public static void main(String[] args) {
		
		EntityManager em = null;

		try
		{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();
		em.getTransaction().begin();	
		
		PermanentAddress permadd = new PermanentAddress();
		permadd.setDoorNo(104);
		permadd.setState("Cali");
		
		Customer cust = new Customer();
		cust.setCustId(1004);
		cust.setCustName("Rahul");
		cust.setAddress(permadd);
		
		em.persist(cust);

		em.getTransaction().commit();
		System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
		
	}
	
	
}
