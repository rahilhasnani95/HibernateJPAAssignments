package com.wellsbank.manytomanyuni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Account_MtoM acc1 = new Account_MtoM();
			acc1.setAccountId(1111);
			acc1.setBalance(25000);

			Account_MtoM acc2 = new Account_MtoM();
			acc2.setAccountId(2222);
			acc2.setBalance(50000);
			
			List list1 = new ArrayList();
			list1.add(acc1);
			list1.add(acc2);
			
			JointAccountHolder joint1 = new JointAccountHolder();
			joint1.setCustomerId(1);
			joint1.setName("Rahil");
			joint1.setAccount(list1);
			
			JointAccountHolder joint2 = new JointAccountHolder();
			joint2.setCustomerId(2);
			joint2.setName("James");
			joint2.setAccount(list1);
			
			em.persist(joint1);
			em.persist(joint2);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
	}
	
	
}
