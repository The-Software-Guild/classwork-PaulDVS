package com.sg.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sg.entities.Customers;
import com.sg.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping(path = "/customers/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customers getCustomerByIdResource(@PathVariable String customerId) {
		return customerService.getCustomersByCustomerId(customerId);
	}
}
