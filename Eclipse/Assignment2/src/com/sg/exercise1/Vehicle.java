package com.sg.exercise1;

public class Vehicle {
	private String type;
	private String colour;
	
	public Vehicle(String type, String colour) {
		super();
		this.type = type;
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String sfx() {
		return "";
	}

	public String justPassed() {
		return "";
	}
}
