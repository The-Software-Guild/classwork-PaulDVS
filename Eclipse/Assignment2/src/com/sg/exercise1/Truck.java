package com.sg.exercise1;

public class Truck extends Vehicle {
	
	public Truck(String type, String colour) {
		super(type, colour);
	}
	
	public String sfx() {
		return "VROOOOM";
	}
	
	public String justPassed() {
		return ("The new vehicle just passed a " + this.getColour() + " " + this.getType() + " truck");
	}
}
