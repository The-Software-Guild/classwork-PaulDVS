package com.sg.exercise2;

public class Sphere extends Shape3D {
	public double volume(int width, int length, int height) {
		return ((width/2)*(width/2)*(width/2) * 3.14 * 4/3);
	}
	
	public double surfaceArea(int width, int length, int height) {
		return (4* 3.14 *(width/2)*(width/2));
	}
}
