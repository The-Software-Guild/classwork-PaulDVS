package com.sg.service;

import com.sg.entities.Customers;

public interface CustomerService {
	Customers getCustomersByCustomerId(String customerId);
}
