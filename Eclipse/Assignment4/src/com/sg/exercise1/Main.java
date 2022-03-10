package com.sg.exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Employee employeeList[] = new Employee[12];
		employeeList[0] = new Employee("Jack", 20);
		employeeList[1] = new Employee("Alex", 25);
		employeeList[2] = new Employee("Anna", 23);
		employeeList[3] = new Employee("John", 40);
		employeeList[4] = new Employee("Adam", 32);
		employeeList[5] = new Employee("Steve", 38);
		
		String inputName;
		int inputAge;
		
		
		try {
			System.out.println("Please enter the new employee's name: ");
			inputName = userInput.nextLine();
			
			for(int i = 0; i < 12; i++) {
				if(employeeList[i] != null) {
					employeeList[i].checkName(inputName);
				}
			}
			
			
			System.out.println("Please enter the new employee's age: ");
			inputAge = userInput.nextInt();
			
			if(inputAge<0) {
				throw new InvalidAge("Age cannot be negative");
			} else if(inputAge<18){
				throw new InvalidAge("Cannot recruit people younger than 18");
			}else if(inputAge>60){
				throw new InvalidAge("Cannot recruit people older than 60");
			}
			
			for(int i = 0; i < 12; i++) {
				if(employeeList[i] == null) {
					employeeList[i] = new Employee(inputName, inputAge);
				}
			}
			
			System.out.println("Employee succesfully added");
			
		} catch (NonUniqueName e) {
			System.out.println(e.getMessage());
		} catch(InvalidAge e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Unidentified Error");
		}

	}

}
