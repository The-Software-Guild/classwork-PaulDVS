package com.sg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sg.entities.Customer;
import com.sg.entities.CustomerDetail;
import com.sg.entities.CustomerDetails;
import com.sg.entities.Customers;
import com.sg.entities.Share;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public CustomerDetails getCustomerDetailsByCustomerId(String customerId) {
		Customers customers = restTemplate.getForObject("http://localhost:8081/customers/"+customerId, Customers.class);

		List<CustomerDetail> customerDetailList = new ArrayList<CustomerDetail>();
		
		for(Customer customer: customers.getCustomerList()) {
			Share share = restTemplate.getForObject("http://localhost:8082/shares/"+customer.getShareId(), Share.class);
			CustomerDetail customerDetail = new CustomerDetail(customerId, share.getShareName(), customer.getQuantity(), share.getMarketPrice(), (customer.getQuantity()*share.getMarketPrice()), customer.getShareType() );
			customerDetailList.add(customerDetail);
		}
		
		CustomerDetails customerDetails = new CustomerDetails(customerDetailList);
		
		return customerDetails;
	}

}
