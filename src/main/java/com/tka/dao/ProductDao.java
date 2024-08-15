package com.tka.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tka.config.HibernateConfig;
import com.tka.entity.*;



public class ProductDao {
	
	SessionFactory sf = HibernateConfig.getSessionFactory();// global declaration 
	public String addProduct(Product product) {
		
		//SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		session.save(product);
		session.beginTransaction().commit();
		return "Added data Succefully";
		
	}
	public Object getProductById(long productId) {
		Session session = sf.openSession();
		Product product = session.get(Product.class, productId);
		
		return product;
	}
	
	public String  deleteProductById(long productId) {
		Session session = sf.openSession();
		Product product = session.get(Product.class, productId);
		session.delete(product);
		session.beginTransaction().commit();
		
		return "Data is deleted Success";
		
	}
	public String  UpdateProduct(Product product) {
		
		return null;
		
	}
	
	
}
