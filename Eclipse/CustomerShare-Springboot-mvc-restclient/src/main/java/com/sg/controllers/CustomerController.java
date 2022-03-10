package com.sg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sg.entities.CustomerDetails;
import com.sg.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String getMainPageController() {
		return "index";
	}
	
	@RequestMapping("/search")
	public String getSearchPageController() {
		return "input";
	}
	
	@RequestMapping("/searchCustomerdetails")
	public ModelAndView getCustomerDetailsController(@RequestParam("customerId") String customerId) {
		ModelAndView modelAndView=new ModelAndView();
		CustomerDetails customerDetails = customerService.getCustomerDetails(customerId);
		System.out.println(customerDetails);
		modelAndView.addObject("customerDetails", customerDetails.getCustomerDetailList());
		modelAndView.setViewName("results");
		return modelAndView;
	}
}
