package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo2 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
		EntityManager em=emf.createEntityManager();

		try
		{
			int customerId = 1;
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			Query q = em.createQuery("select c from Customer26 c where c.customerId =?1");
			q.setParameter(1, customerId);
			
			List rs = q.getResultList();
			
			if(rs.size()!=0)
			{
				Customer26 c = (Customer26) rs.get(0);
				System.out.println();
				System.out.println(c.getName());
				System.out.println(c.getAddress());
				System.out.println(c.getCity());
				System.out.println(c.geteMail());
				System.out.println(c.getFax());
				System.out.println(c.getGender());
				System.out.println(c.getPin());
				System.out.println(c.getState());
			}
			else
			{
				System.out.println("No records found");
			}
			
			et.commit();

		}
		finally
		{
			em.close();
		}

	}



}
