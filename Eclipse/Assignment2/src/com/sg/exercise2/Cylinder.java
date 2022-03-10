package com.sg.exercise2;

public class Cylinder extends Shape3D {
	public double volume(int width, int length, int height) {
		return (3.14 * height * (width/2)*(width/2));
	}
	
	public double surfaceArea(int width, int length, int height) {
		return ((2* 3.14 *(width/2) * height) + (2* 3.14 *(width/2)*(width/2)));
	}
}
