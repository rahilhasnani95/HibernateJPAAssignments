package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueryDemo {

	public static void main(String[] args) {

		EntityManager em = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		try
		{
			em = emf.createEntityManager();
			em.getTransaction().begin();

			
			Query nameqquery = em.createNamedQuery("custdetailswithT");
			List<Customer26> customers = nameqquery.getResultList();
			
			for(int i = 0; i < customers.size(); i++)
			{
				Customer26 c = customers.get(i);
				System.out.println(c.getCustomerId());
				System.out.println(c.getName());
			}
			
			em.getTransaction().commit();
		}
		finally
		{
			em.close();
		}
	}

	}
