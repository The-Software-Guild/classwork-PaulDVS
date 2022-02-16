package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class DoItBetter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int milesRun;
        int hotDogs;
        int languages;
        
        System.out.println("How many miles did you run?");
        milesRun = Integer.parseInt(inputReader.nextLine());
        System.out.println("Realy? Well I ran " + ((milesRun*2)+1));
        
        System.out.println("How many hotdogs did you eat?");
        hotDogs = Integer.parseInt(inputReader.nextLine());
        System.out.println("Realy? Well I ate " + ((hotDogs*2)+1));
        
        System.out.println("How many languages do you know?");
        languages = Integer.parseInt(inputReader.nextLine());
        System.out.println("Realy? Well I know " + ((languages*2)+1));
        
    }
}
