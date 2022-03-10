package com.sg.exercise1;

public class Main {

	public static void main(String[] args) {
		Road road = new Road();
		
		Vehicle newVehicle;
		
		
		newVehicle = new Car("BMW", "Red");
		road.newVehicle(newVehicle);
		
		newVehicle = new Truck("Monster", "Black");
		road.newVehicle(newVehicle);
		
		newVehicle = new Bus("School", "Yellow");
		road.newVehicle(newVehicle);
		
		newVehicle = new Bus("City", "White");
		road.newVehicle(newVehicle);
		
		newVehicle = new Truck("Lifted", "Gray");
		road.newVehicle(newVehicle);
		
		newVehicle = new Car("Audi", "Blue");
		road.newVehicle(newVehicle);

	}

}
