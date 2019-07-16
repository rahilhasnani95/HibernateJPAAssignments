package com.wellsbank.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeePersistDS {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			PartTimeEmployee ptemp = new PartTimeEmployee();
			ptemp.setEmpId(1001);
			ptemp.setName("Rahil");
			ptemp.setWages(50000000);
			
			em.persist(ptemp);
			
			
			FullTimeEmployee ftemp = new FullTimeEmployee();
			ftemp.setEmpId(1002);
			ftemp.setName("Ajay");
			ftemp.setSalary(10000);
			
			em.persist(ftemp);
			
			em.getTransaction().commit();
			
			System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
		
		
	}
	
	
}
