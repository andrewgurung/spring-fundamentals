package com.andrewgurung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.andrewgurung.model.Customer;
import com.andrewgurung.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	
//	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {

	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
