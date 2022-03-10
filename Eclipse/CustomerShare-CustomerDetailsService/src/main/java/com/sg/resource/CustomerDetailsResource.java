package com.sg.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sg.entities.CustomerDetails;
import com.sg.service.CustomerDetailsService;

@RestController
public class CustomerDetailsResource {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@GetMapping(path = "/customerdetails/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDetails getCustomerDetailsByCustomerIdResource(@PathVariable String customerId) {
		return customerDetailsService.getCustomerDetailsByCustomerId(customerId);
	}
}
