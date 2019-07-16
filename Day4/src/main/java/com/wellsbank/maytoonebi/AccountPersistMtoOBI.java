package com.wellsbank.maytoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.manytoone.Account_MtoO;
import com.wellsbank.manytoone.Customer_MtoO;

public class AccountPersistMtoOBI {

	public static void main(String[] args) {
		
		EntityManager em = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			MOCustomerBI cust = new MOCustomerBI();
			cust.setCustId(1);
			cust.setCustName("krishna");
			
			AccountBI acc1 = new AccountBI();
			acc1.setAccountId(1001);
			acc1.setAccounttype("savings");
			acc1.setCustomer(cust);
			
			AccountBI acc2 = new AccountBI();
			acc2.setAccountId(1002);
			acc2.setAccounttype("checking");
			acc2.setCustomer(cust);
			
			AccountBI acc3 = new AccountBI();
			acc3.setAccountId(1003);
			acc3.setAccounttype("loan");
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
