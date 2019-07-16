package com.wellsbank.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountPersist {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			SavingsAccount savings = new SavingsAccount();
			savings.setAccountNo(1001);
			savings.setBalance(20000.00);
			savings.setInterestRate(12.22);
			savings.setMinBalance(500);
			
			em.persist(savings);
			
			LoanAccount loan = new LoanAccount();
			loan.setAccountNo(1002);
			loan.setBalance(14000);
			loan.setLoanAmount(1000);
			loan.setLoanType("Car Loan");
			
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
