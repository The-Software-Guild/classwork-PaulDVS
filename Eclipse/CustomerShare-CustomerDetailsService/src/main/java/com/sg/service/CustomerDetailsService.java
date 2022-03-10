package com.sg.service;

import com.sg.entities.CustomerDetails;

public interface CustomerDetailsService {
	public CustomerDetails getCustomerDetailsByCustomerId(String customerId);
}
