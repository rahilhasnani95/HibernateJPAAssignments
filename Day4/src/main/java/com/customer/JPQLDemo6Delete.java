package com.customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo6Delete {

	public static void main(String[] args) {
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		
		try
		{
			int cId = 2;
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query q = em.createQuery("delete from Customer26 c where c.customerId =?1");
			
			q.setParameter(1, cId);
			
			int deletecount = q.executeUpdate();
			
			if(deletecount!=0)
			{
				System.out.println(deletecount +" Row deleted");
			}
			else
			{
				System.out.println("Not deleted");
			}
			
			em.getTransaction().commit();
		}
		finally
		{
			em.close();
		}
				
	}
	
	
}
