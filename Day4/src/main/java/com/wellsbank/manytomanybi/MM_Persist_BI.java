package com.wellsbank.manytomanybi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.manytomanyuni.JointAccountHolder;
import com.wellsbank.singletable.Account;

public class MM_Persist_BI {

	public static void main(String[] args) { 
		MM_Account_BI acc1=new MM_Account_BI();
		acc1.setAccountId(1111);
		
		MM_Account_BI acc2=new MM_Account_BI();
		acc2.setAccountId(2222);
		
		List<MM_Account_BI> list=new ArrayList<MM_Account_BI>();
		list.add(acc1);
		list.add(acc2);
		
		MM_JointAccountHolder_BI joint=new MM_JointAccountHolder_BI();
		joint.setCustomerId(1);
		joint.setBalance(999999);
		joint.setAccount(list);
		
		MM_JointAccountHolder_BI joint2=new MM_JointAccountHolder_BI();
		joint2.setCustomerId(2);
		joint2.setBalance(7777);
		joint2.setAccount(list);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		EntityManager em = emf.createEntityManager();
		try 
		{
			em.getTransaction().begin();
			em.persist(joint);
			em.persist(joint2);
			em.getTransaction().commit();
			System.out.println("persisted");
		}
		finally
		{
			em.close();
		}

	}

}
