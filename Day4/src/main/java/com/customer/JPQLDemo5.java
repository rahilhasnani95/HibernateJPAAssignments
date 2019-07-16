package com.customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo5 {


	public static void main(String[] args) {
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		
		try
		{
			int cId = 1;
			String city = "Orlando";
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query q = em.createQuery("update Customer26 c set c.city =?1 where c.customerId =?2");
			
			q.setParameter(1, city);
			q.setParameter(2, cId);
			
			int updatecount = q.executeUpdate();
			
			if(updatecount!=0)
			{
				System.out.println(updatecount +" Row updated");
			}
			else
			{
				System.out.println("Not updated");
			}
			
			em.getTransaction().commit();
		}
		finally
		{
			em.close();
		}
				
	}
	
	
}
