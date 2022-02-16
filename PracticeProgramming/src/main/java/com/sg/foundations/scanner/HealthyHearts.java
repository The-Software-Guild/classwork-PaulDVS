package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int age;
        int maxBeats;
        double hrMin;
        double hrMax;
                
        System.out.println("Please enter your age: ");
        age = Integer.parseInt(inputReader.nextLine());
        maxBeats = 220-age;
        hrMin = maxBeats * 0.5;
        hrMax = maxBeats * 0.85;
        
        System.out.println("Your maximum heart rate should be " + maxBeats + " beats per minute");
        System.out.println("Your target HR Zone is " + hrMin + " - " + hrMax + " beats per minute");
    }
}
