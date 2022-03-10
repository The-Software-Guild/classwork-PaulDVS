package com.sg.exercise1;

public class Road {
	Vehicle traffic[] = new Vehicle[12];
	
	public void newVehicle(Vehicle newVehicle) {
		System.out.println("");
		System.out.println(newVehicle.sfx());
		
		for(int i = 0; i<12; i++) {
			if(traffic[i] != null) {
				System.out.println(traffic[i].justPassed());
			} else {
				traffic[i] = newVehicle;
				i = 999;
			}
		}
	}
}
