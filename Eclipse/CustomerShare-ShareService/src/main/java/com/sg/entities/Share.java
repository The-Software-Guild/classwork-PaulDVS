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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Share {

	@Setter
	@Getter
	@Id
	private int shareId;
	@Setter
	@Getter
	private String shareName;
	@Setter
	@Getter
	private double marketPrice;
}
