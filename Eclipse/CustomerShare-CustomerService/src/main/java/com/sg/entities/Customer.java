package com.sg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {

	@Setter
	@Getter
	@Id
	private int detailId;
	@Setter
	@Getter
	private String customerId;
	@Setter
	@Getter
	private int shareId;
	@Setter
	@Getter
	private String shareType;
	@Setter
	@Getter
	private int quantity;
}
