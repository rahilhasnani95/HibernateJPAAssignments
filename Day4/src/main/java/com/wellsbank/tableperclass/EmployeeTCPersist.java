package com.wellsbank.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTCPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			TechAssociate t = new TechAssociate();
			t.setEmpId(1001);
			t.setName("rahil");
			t.setNoOfLabs(5);
			
			em.persist(t);
			
			EvangeList e = new EvangeList();
			e.setEmpId(1002);
			e.setName("ajay");
			e.setNoOfSessions(10);
			
			em.persist(e);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
	}
	
}
