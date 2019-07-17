package com.rahil.dao;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.ws.Response;

import com.mysql.cj.jdbc.Blob;
import com.rahil.entities.ProductBean;
import com.rahil.entities.UserBean;

public class ProductDAO {

	DatabaseConnection db = new DatabaseConnection();
	public void addNewProductAdmin(String itemname, int itemprice, int itemquantity)
	{
		EntityManager em = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateproject");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			ProductBean product = new ProductBean(itemname, itemprice, itemquantity);
			
			em.persist(product);
			em.getTransaction().commit();
		System.out.println("gen value" + product.getItemid());
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			em.close();
		}
		
	}
	
	public void updateQuantityOfProductAdmin(int itemid, int quantity)
	{
		EntityManager em = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateproject");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			ProductBean p = em.find(ProductBean.class, itemid);
			
			if(p!= null)
			{
				p.setItemquantity(quantity);
				em.getTransaction().commit();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			em.close();
		}
	
	}
	
	public List<ProductBean> getProducts()
	{
		EntityManager em = null;
		List list = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateproject");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query q = em.createQuery("select p from ProductBean p where p.itemquantity > 0");
			
			list = q.getResultList();
			
			return list;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	return list;
		
	
	}
	
	public List<ProductBean> getAllProductsforAdmin()
	{
		EntityManager em = null;
		List list = null;
		try
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateproject");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query q = em.createQuery("select p from ProductBean p");
			
			list = q.getResultList();
			
			return list;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	return list;	
	}
	
}
