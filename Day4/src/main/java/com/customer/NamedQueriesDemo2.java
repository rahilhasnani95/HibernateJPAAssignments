package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueriesDemo2 {

	public static void main(String[] args) {

		EntityManager em = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		try
		{
			em = emf.createEntityManager();
			em.getTransaction().begin();

			int cId=1;
			Query nameqquery1 = em.createNamedQuery("deletecustwithid");
			Query nameqquery2 = em.createNamedQuery("retreivecust");

			nameqquery1.setParameter(1, cId);
			int deletcount = nameqquery1.executeUpdate();
			
			if(deletcount!=0)
			{
				System.out.println(deletcount+ " row deleted");
			} else {
				System.out.println("No rows deleted");
			}
			
			List<Customer26> customers = nameqquery2.getResultList();
			
			for(int i = 0; i < customers.size(); i++)
			{
				Customer26 c = customers.get(i);
				System.out.println(c.getCustomerId());
				System.out.println(c.getName());
				System.out.println();
			}
			
			em.getTransaction().commit();
		}
		finally
		{
			em.close();
		}

	}

	
	
	
}
