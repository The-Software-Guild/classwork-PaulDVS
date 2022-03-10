package com.sg.exercise3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int loopVar = 1;
		int userChoice;
		int employeeID;
		int courseID;
		
		
		Enroll enrollSystem = new Enroll();
		
		do {
			userChoice = 0;
			employeeID = 0;
			courseID = 0;
			
			System.out.println("");
			
			
			System.out.println("Employee Courses Menu: ");
			System.out.println("1: Register Employee for course");
			System.out.println("2: List out Employees in a course");
			System.out.println("3: Deregister Employees from course");
			System.out.println("4: Exit");
			userChoice = Integer.parseInt(inputReader.nextLine());
			
			if(userChoice == 1) {
				enrollSystem.listCourses();
				System.out.println("");
				System.out.println("Enter the ID of the course to enroll: ");
				courseID = Integer.parseInt(inputReader.nextLine());
				
				enrollSystem.listEmployees();
				System.out.println("");
				System.out.println("Enter the ID of the Employee to enroll: ");
				employeeID = Integer.parseInt(inputReader.nextLine());
				
				enrollSystem.register(courseID, employeeID);
				System.out.println("Employee Successfully enrolled");
				
			} else if(userChoice == 2) {
				enrollSystem.listCourses();
				System.out.println("");
				System.out.println("Enter the ID of the course to view attendees: ");
				courseID = Integer.parseInt(inputReader.nextLine());
				
				enrollSystem.viewCourseAttendees(courseID);
				
			} else if(userChoice == 3) {
				enrollSystem.listCourses();
				System.out.println("");
				System.out.println("Enter the ID of the course to remove an employee from: ");
				courseID = Integer.parseInt(inputReader.nextLine());
				
				enrollSystem.viewCourseAttendees(courseID);
				System.out.println("");
				System.out.println("Enter the ID of the Employee to remove: ");
				employeeID = Integer.parseInt(inputReader.nextLine());
				
				enrollSystem.deRegister(courseID, employeeID);
				System.out.println("Employee Successfully removed");
				
				
			} else if(userChoice == 4) {
				loopVar = 0;
				break;
			} else {
				System.out.println("Error please try again");
			}

		} while (loopVar == 1);
		
		System.out.println("");
		System.out.println("Closing");

	}

}
