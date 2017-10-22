package com.andrewgurung.service;

import java.util.List;

import com.andrewgurung.model.Customer;
import com.andrewgurung.repository.CustomerRepository;
import com.andrewgurung.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.andrewgurung.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
