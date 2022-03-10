package com.sg.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.entities.Customer;

@Repository
public interface CustomerDoa extends JpaRepository<Customer, Integer> {

	List<Customer> getCustomerByCustomerId(String customerId);
}
