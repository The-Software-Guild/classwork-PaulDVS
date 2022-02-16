package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int target;
        int count = 0;
        
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        target = Integer.parseInt(inputReader.nextLine());
        
        for (int i = 1; count < target; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                count++;
            } else if (i % 3 == 0){
                System.out.println("Fizz");
                count++;
            } else if (i % 5 == 0){
                System.out.println("Buzz");
                count++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
