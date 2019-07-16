package com.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpJobAndDeptLocation {

	public static void main(String[] args) {
		
		EntityManager em = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

		try
		{
			em = emf.createEntityManager();
			em.getTransaction().begin();

			Query q = em.createQuery("select emp, dept from EmployeeJPQL emp, DepartmentJPQL dept where emp.deptNo = dept.deptNo and (emp.job = 'Manager' or emp.job = 'President') and (dept.loc = 'Boston' or dept.loc = 'New York')");

			List list = q.getResultList();
			
			for(int i = 0; i < list.size(); i++)
			{
				
				System.out.println();
				Object[] obj =  (Object[]) list.get(i);
				EmployeeJPQL e1 = (EmployeeJPQL) obj[0];
				DepartmentJPQL d1 = (DepartmentJPQL) obj[1];
				
				 System.out.println("Emp Name: "+e1.getEName());
				 System.out.println("Emp Name: "+d1.getLoc());
				
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
