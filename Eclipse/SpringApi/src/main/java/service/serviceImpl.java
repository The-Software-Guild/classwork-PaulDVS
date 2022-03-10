package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import entities.product;
import persistence.ProductDoa;

@Service
public class serviceImpl implements serviceDoa {
	
	@Autowired
	private ProductDoa productDoa;

	@Override
	public product getProductById(int id) {
		return productDoa.getById(id);
	}

	@Override
	public String greet() {
		return "Hello";
	}

}
