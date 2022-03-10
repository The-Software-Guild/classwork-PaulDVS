package com.sg.instancecounting;

public class Main {

	public static void main(String[] args) {

		Sample sample1 = new Sample();
		System.out.println(sample1.getTimeInstantiated());
		
		Sample sample2 = new Sample();
		System.out.println(sample2.getTimeInstantiated());
		
		Sample sample3 = new Sample();
		System.out.println(sample3.getTimeInstantiated());
		
		Sample sample4 = new Sample();
		System.out.println(sample4.getTimeInstantiated());

	}

}
