package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        
        System.out.println("Please enter the first number: ");
        num1 = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please enter the second number: ");
        num2 = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please enter the third number: ");
        num3 = Integer.parseInt(inputReader.nextLine());
        
        int result = num1+num2+num3;
        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
    }
}
