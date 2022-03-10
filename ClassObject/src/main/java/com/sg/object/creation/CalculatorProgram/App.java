package com.sg.object.creation.CalculatorProgram;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class App {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        SimpleCalculator myCalculator = new SimpleCalculator();
        int userChoice = 0;
        
        do{
            userChoice = 0;
            System.out.println("");
            System.out.println("Please enter the program to run: ");
            System.out.println("1: Addition. 2: Subtraction.");
            System.out.println("3: Multiplication. 4: Division");
            System.out.println("5 Exit");
            userChoice = Integer.parseInt(inputReader.nextLine());
            
            if(userChoice ==5){
                break;
            }

            System.out.println("Please enter the first operand: ");
            double num1 = Integer.parseInt(inputReader.nextLine());

            System.out.println("Please enter the second operand: ");
            double num2 = Integer.parseInt(inputReader.nextLine());
            
            System.out.println("The result is: ");
            if(userChoice ==1){
                System.out.println(myCalculator.addition(num1, num2));
            } else if(userChoice ==2){
                System.out.println(myCalculator.subtraction(num1, num2));
            } else if(userChoice ==3){
                System.out.println(myCalculator.multiplication(num1, num2));
            } else if(userChoice ==4){
                System.out.println(myCalculator.division(num1, num2));
            }
            
        } while(userChoice !=5);
    }
}
