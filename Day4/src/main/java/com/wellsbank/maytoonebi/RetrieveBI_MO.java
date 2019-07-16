package com.wellsbank.maytoonebi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveBI_MO {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		try 
		{
			MOCustomerBI cust1 = em.find(MOCustomerBI.class, 1);
			
			List<AccountBI> account = cust1.getAccount();
			
				for(int i = 0; i < account.size(); i++)
				{
					AccountBI acc = account.get(i);
					System.out.println("Account Id : " + acc.getAccountId());
					
					System.out.println("Account Type : " + acc.getAccounttype());
					
					System.out.println("Cust Id: " +acc.getCustomer().getCustId());
					System.out.println("Cust Name : "+acc.getCustomer().getCustName());
				}
		}
		finally
		{
			em.close();
		}

	}


}

