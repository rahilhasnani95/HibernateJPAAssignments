package com.wellsbank.services;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Employee;

public class EmployeeDS {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		emp.setUserId("rahilh");
		emp.setName("Rahil H");
		emp.setGender('M');
		emp.setDateofJoin(new GregorianCalendar(1995,1,1));
		emp.setEmail("rh@gmail.com");
		emp.setJob("developer");
		
		em.persist(emp);
		em.getTransaction().commit();
		
	}

}
