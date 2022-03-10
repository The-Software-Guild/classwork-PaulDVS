package com.sg.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Share {

	@Setter
	@Getter
	private int shareId;
	@Setter
	@Getter
	private String shareName;
	@Setter
	@Getter
	private double marketPrice;
}
