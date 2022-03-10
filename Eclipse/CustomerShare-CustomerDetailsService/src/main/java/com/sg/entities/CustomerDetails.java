package com.sg.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
	@Setter
	@Getter
	List<CustomerDetail> customerDetailList;
	
}
