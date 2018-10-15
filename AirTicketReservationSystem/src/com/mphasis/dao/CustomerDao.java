package com.mphasis.dao;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mphasis.model.dto.Customer;



public class CustomerDao {
	
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

public Long save(Customer entity){
	
	
	Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		
		Long id = (Long) session.save(entity);
		
		session.getTransaction().commit();
		
		System.out.println(id);
		
		return id;
		
	}

public Customer getByEmailandPassword(String email, String password) {
	Session session = sessionFactory.openSession();
	
	Query<Customer> q = (Query<Customer>) session.createQuery("from Customer where email='"+email+"' AND password='"+password+"'");
	
	Customer customer = (Customer) q.getSingleResult();
	
	return customer;
	
}
	
}
