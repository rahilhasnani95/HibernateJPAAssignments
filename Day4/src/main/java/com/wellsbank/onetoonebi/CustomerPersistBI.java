package com.wellsbank.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersistBI {

public static void main(String[] args) {
		
		EntityManager em = null;

		try
		{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();
		em.getTransaction().begin();	
		
		PermanentAddressBI permadd = new PermanentAddressBI();
		permadd.setDoorNo(102);
		permadd.setState("NewYork");
		
		CustomerBI cust = new CustomerBI();
		cust.setCustId(1002);
		cust.setCustName("Rahil");
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
