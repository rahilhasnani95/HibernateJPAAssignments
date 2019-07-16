package com.customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo4 {

	public static void main(String[] args) {
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		
		try
		{
			int cId = 1;
			String cname = "Vivek Bhatia";
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query q = em.createQuery("update Customer26 c set c.name = :customerName where c.customerId =:custId");
			
			q.setParameter("customerName", cname);
			q.setParameter("custId", cId);
			
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
