package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CallFunctionFindDestination {

public static void main(String[] args) {
		
		EntityManager em = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		try
		{
			em = emf.createEntityManager();
			em.getTransaction().begin();

			Query q = em.createNativeQuery("select sf_finddesignation(?1) from dual");
			
			q.setParameter(1,2);
			
			String s =  (String) q.getSingleResult();
		
			
			System.out.println(s);
			
			if(s.equals("president"))
			{
				System.out.println("The JOB is of High responsibility.");
			}
			else if (s.equals("manager"))
			{
				System.out.println("The JOB is of Team Management.");
			}
			else if (s.equals("supervisor"))
			{
				System.out.println("The JOB is supervision.");
			}
			else if (s.equals("engineer"))
			{
				System.out.println("The JOB is of Technology.");
			}
			else
			{
				System.out.println("The JOB is invalid");
			}
			
			em.getTransaction().commit();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			em.close();
		}
}
}
