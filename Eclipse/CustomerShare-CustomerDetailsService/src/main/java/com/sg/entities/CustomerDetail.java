package com.sg.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetail {
	@Setter
	@Getter
	private String customerId;
	@Setter
	@Getter
	private String shareName;
	@Setter
	@Getter
	private int quantity;
	@Setter
	@Getter
	private double marketPrice;
	@Setter
	@Getter
	private double totalValuation;
	@Setter
	@Getter
	private String shareType;
}
