package com.sg.exercise1;

public class Bus extends Vehicle {
	
	public Bus(String type, String colour) {
		super(type, colour);
	}
	
	public String sfx() {
		return "Beep Beep";
	}
	
	public String justPassed() {
		return ("The new vehicle just passed a " + this.getColour() + " " + this.getType() + " bus");
	}
}
