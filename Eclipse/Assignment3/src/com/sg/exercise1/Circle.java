package com.sg.exercise1;

public class Circle implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Circle fill colour");

	}

	@Override
	public void size() {
		System.out.println("Circle size");

	}

	@Override
	public void drawingColor() {
		System.out.println("Circle line colour");

	}

	@Override
	public void thickness() {
		System.out.println("Circle line thickness");

	}

}
