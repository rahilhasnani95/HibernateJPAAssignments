package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeMaxSalary {

	public static void main(String[] args) {

		EntityManager em = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		try
		{
			em = emf.createEntityManager();
			em.getTransaction().begin();

			Query q = em.createQuery("select emp from EmployeeJPQL emp where emp.sal = (select max(emp.sal) from EmployeeJPQL emp)");

			List list = q.getResultList();
			
			for(int i = 0; i < list.size(); i++)
			{
				System.out.println();
				EmployeeJPQL e1 = (EmployeeJPQL) list.get(i);
				 System.out.println("Salary :" +e1.getSal());
				 System.out.println("Emp Name: "+e1.getEName());
				
			}

			em.getTransaction().commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			em.close();
		}
	
	}
}
