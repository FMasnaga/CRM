package com.luv2code.springdemo.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		//get the current hiberante session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query 
		Query<Customer> q= currentSession.createQuery("from Customer order by lastName",Customer.class);
		
		//execute query and get result list
		List<Customer> res = q.getResultList();
		
		//return the results
		return res;
	}

	@Override
	public void saveCustomer(Customer c) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(c);
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer c = currentSession.get(Customer.class, theId);
		return c;
	}

	@Override
	public void deleteCustomer(int customerId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query q = currentSession.createQuery("delete from Customer where id=:cid");
		q.setParameter("cid", customerId);
		
		q.executeUpdate();
	}
}
