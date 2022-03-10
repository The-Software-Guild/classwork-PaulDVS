package com.sg.exercise1;

public class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Square fill colour");

	}

	@Override
	public void size() {
		System.out.println("Square size");

	}

	@Override
	public void drawingColor() {
		System.out.println("Square line colour");

	}

	@Override
	public void thickness() {
		System.out.println("Square line thickness");

	}

}
