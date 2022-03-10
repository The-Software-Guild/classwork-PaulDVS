package com.sg.exercise3;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		Map<String, String> phoneBook = new TreeMap<String, String>();
		int userInput = 0;
		String searchStatement;
		
		phoneBook.put("Barry's Butchers", "0000 0000 0000");
		phoneBook.put("Emily's Salon", "0000 0000 0001");
		phoneBook.put("John's Phone Warehouse", "0000 0000 0002");
		phoneBook.put("Garry's Bakery", "0000 0000 0003");
		phoneBook.put("Amazon UK helpline", "0000 0000 0004");
		
		
		Set<String> keyValues = phoneBook.keySet();
		do{
			System.out.println("");
			System.out.println("Menu: ");
			System.out.println("1: View Phonebook ");
			System.out.println("2: Search for number");
			System.out.println("4: Quit ");
			
			userInput = inputReader.nextInt();
			inputReader.nextLine();
			
			switch(userInput) {
				case 1:
					System.out.println("");
					for(String keyValue:keyValues)
					System.out.println(keyValue + ": " + phoneBook.get(keyValue));
					break;
				
				case 2:
					System.out.println("");
					System.out.println("Please enter the name of the business: ");
					searchStatement = inputReader.nextLine();
					for(String keyValue:keyValues) {
						if(searchStatement.equals(keyValue)) {
							System.out.println(keyValue + ": " + phoneBook.get(keyValue));
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
