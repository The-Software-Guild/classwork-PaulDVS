package com.sg.exercise2;

public class Main {

	public static void main(String[] args) {
		Shape3D shape;
		
		
		shape = new Cube();
		System.out.println(shape.volume(5, 5, 5));
		System.out.println(shape.surfaceArea(5, 5, 5));
		
		
		shape = new Cylinder();
		System.out.println(shape.volume(20, 20, 100));
		System.out.println(shape.surfaceArea(20, 20, 100));
		
		shape = new Sphere();
		System.out.println(shape.volume(20, 20, 20));
		System.out.println(shape.surfaceArea(20, 20, 20));

	}

}
