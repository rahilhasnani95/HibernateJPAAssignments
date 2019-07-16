package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo1 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction et=em.getTransaction();
			et.begin();
			Query query = em.createQuery("select c from Customer26 c");
			List rs = query.getResultList();
			
			int size = rs.size();
			
			for(int i = 0; i < size; i++)
			{
				Customer26 c = (Customer26) rs.get(i);
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

		}
		finally
		{
			em.close();
		}

	}

}
