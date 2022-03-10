package com.sg.exercise4;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		Map<String, String> dictionary = new TreeMap<String, String>();
		int userInput = 0;
		String searchStatement;
		
		//From https://dictionary.cambridge.org/dictionary/english
		dictionary.put("Leisure", "The time when you are not working or doing other duties");
		dictionary.put("Culture", "The way of life, especially the general customs and beliefs, of a particular group of people at a particular time");
		dictionary.put("Prejudice", "An unfair and unreasonable opinion or feeling, especially when formed without enough thought or knowledge");
		dictionary.put("Attribute", "A quality or characteristic that someone or something has");
		dictionary.put("Research", "A detailed study of a subject, especially in order to discover (new) information or reach a (new) understanding");
		
		Set<String> keyValues = dictionary.keySet();
		do{
			System.out.println("");
			System.out.println("Menu: ");
			System.out.println("1: View dictionary ");
			System.out.println("2: Search for word");
			System.out.println("4: Quit ");
			
			userInput = inputReader.nextInt();
			inputReader.nextLine();
			
			switch(userInput) {
				case 1:
					System.out.println("");
					for(String keyValue:keyValues)
					System.out.println(keyValue + ": " + dictionary.get(keyValue));
					break;
				
				case 2:
					System.out.println("");
					System.out.println("Please enter the word you want to look up: ");
					searchStatement = inputReader.nextLine();
					for(String keyValue:keyValues) {
						if(searchStatement.equals(keyValue)) {
							System.out.println(keyValue + ": " + dictionary.get(keyValue));
						}
					}
					break;
					
				case 4:
					System.out.println("");
					System.out.println("Quiting program ");
			}
		} while(userInput != 4);
	}

}
