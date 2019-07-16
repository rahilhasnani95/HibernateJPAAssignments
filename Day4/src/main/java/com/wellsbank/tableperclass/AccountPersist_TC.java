package com.wellsbank.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountPersist_TC {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			SavingsAccount_TC savings = new SavingsAccount_TC();
			savings.setAccountNo(1001);
			savings.setBalance(200.00);
			savings.setMinBalance(100);
			em.persist(savings);
			
			LoanAcount_TC loan=new LoanAcount_TC();
			loan.setAccountNo(1002);
			loan.setBalance(1200);
			loan.setLoanAmount(1222);
			em.persist(loan);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
				
				
	}
	
}
