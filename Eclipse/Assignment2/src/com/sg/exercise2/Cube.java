package com.sg.exercise2;

public class Cube extends Shape3D {
	public double volume(int width, int length, int height) {
		return width * length * height;
	}
	
	public double surfaceArea(int width, int length, int height) {
		
		return 2*(width*length + width * height + length*height);
	}
}
