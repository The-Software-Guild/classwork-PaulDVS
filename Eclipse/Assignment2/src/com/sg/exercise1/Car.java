package com.sg.exercise1;

public class Car extends Vehicle {
	
	public Car(String type, String colour) {
		super(type, colour);
	}
	
	public String sfx() {
		return "Nyooooom";
	}
	
	public String justPassed() {
		return ("The new vehicle just passed a " + this.getColour() + " " + this.getType());
	}
}
