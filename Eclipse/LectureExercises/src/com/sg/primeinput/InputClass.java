package com.sg.primeinput;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int inputNum;
		
		try {
			System.out.println("Please input a prime number: ");
			inputNum = userInput.nextInt();
			for(int i=2; i< inputNum; i++) {
				if(inputNum % i == 0  && inputNum !=2) {
					throw new PrimeException("Input number: " + inputNum + " is not a prime number");
				}
			}
			
			System.out.println("Input number: " + inputNum + " is a prime number");
			
			
		} catch (PrimeException e) {
			System.out.println(e.getMessage());
			
		}catch (Exception e){
			System.out.println("Error");
		} finally {
			System.out.println("Finally");
		}

	}

}
