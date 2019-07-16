package com.wellsbank.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import com.wellsbank.entities.Account;

public class AccountDS {

	public static void main(String[] args) {
		
		ReadData readdata = new ReadData();
		
		int accountNo;
		double balance;
		String customerName;
		String userId;
		
		EntityManager em = null;
		
		System.out.println("Enter Account Number: ");
		accountNo = Integer.parseInt(readdata.acceptString());
		System.out.println("Enter Account Balance: ");
		balance = Integer.parseInt(readdata.acceptString());
		System.out.println("Enter Customer Name: ");
		customerName = readdata.acceptString();
		System.out.println("Enter UserID: ");
		userId = readdata.acceptString();
		
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Account account = new Account();
			account.setAccountNo(accountNo);
			account.setBalance(balance);
			account.setCustomerName(customerName);
			account.setUserId(userId);
			
			em.persist(account);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally
		{
			em.close();
		}
		
		
	}
	
}
