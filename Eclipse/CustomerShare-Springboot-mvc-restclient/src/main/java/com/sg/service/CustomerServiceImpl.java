package com.sg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sg.entities.CustomerDetails;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public CustomerDetails getCustomerDetails(String customerId) {
		return restTemplate.getForObject("http://localhost:8083/customerdetails/"+customerId, CustomerDetails.class);
	}

}
