package com.wellsbank.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrieve {

	public static void main(String[] args) {
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();
		
		PermanentAddressBI pa1 = em.find(PermanentAddressBI.class, 101);
		if(pa1 != null)
		{
			CustomerBI cust1 = pa1.getCustomer();
			System.out.println("Cust Id: " + cust1.getCustId());
			System.out.println("Cust Name: " + cust1.getCustName());
			System.out.println();
		}
		
		PermanentAddressBI pa2 = em.find(PermanentAddressBI.class, 102);
		if(pa2 != null)
		{
			CustomerBI cust2 = pa2.getCustomer();
			System.out.println("Cust Id: " + cust2.getCustId());
			System.out.println("Cust Name: " + cust2.getCustName());
			System.out.println();
		}
	}
	
	
	
	
}
