package com.sg.exercise2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> daysOfWeek = new ArrayList<String>();
		
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		
		System.out.println("");
		System.out.println("Content of Arraylist");
		for(int i = 0; i<daysOfWeek.size();i++) {
			System.out.println(daysOfWeek.get(i));
		}
		
		System.out.println("");
		System.out.println("Arraylist length: " + daysOfWeek.size());
		
		
		String[] daysOfWeekArray = daysOfWeek.toArray(new String[daysOfWeek.size()]);
		System.out.println("");
		System.out.println("Content of Array");
		for(int i = 0; i<daysOfWeekArray.length;i++) {
			System.out.println(daysOfWeekArray[i]);
		}
	}

}
