package com.andrewgurung.repository;

import java.util.ArrayList;
import java.util.List;

import com.andrewgurung.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.andrewgurung.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Andrew");
		customer.setLastname("Gurung");
		customers.add(customer);
		return customers;
	}
}
