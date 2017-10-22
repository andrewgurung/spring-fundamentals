package com.andrewgurung.repository;

import java.util.List;

import com.andrewgurung.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}