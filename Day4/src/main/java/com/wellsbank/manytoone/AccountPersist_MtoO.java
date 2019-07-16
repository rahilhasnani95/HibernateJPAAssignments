package com.wellsbank.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.onetoone.PermanentAddress;

public class AccountPersist_MtoO {
	
	public static void main(String[] args) {
	
		EntityManager em = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Customer_MtoO cust = new Customer_MtoO();
			cust.setCustId(1);
			cust.setCustName("rahil");
			
			Account_MtoO acc1 = new Account_MtoO();
			acc1.setAccountId(1001);
			acc1.setAccountType("savings");
			acc1.setCustomer(cust);
			
			Account_MtoO acc2 = new Account_MtoO();
			acc2.setAccountId(1002);
			acc2.setAccountType("checking");
			acc2.setCustomer(cust);
			
			Account_MtoO acc3 = new Account_MtoO();
			acc3.setAccountId(1003);
			acc3.setAccountType("loan");
			acc3.setCustomer(cust);
			
			em.persist(acc1);
			em.persist(acc2);
			em.persist(acc3);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			em.close();
		}
				
	}
	
}
