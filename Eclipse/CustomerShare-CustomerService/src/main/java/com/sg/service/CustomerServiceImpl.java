package com.sg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.entities.Customers;
import com.sg.persistence.CustomerDoa;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDoa customerDoa;
	
	@Override
	public Customers getCustomersByCustomerId(String customerId) {
		return new Customers(customerDoa.getCustomerByCustomerId(customerId));
	}

}
