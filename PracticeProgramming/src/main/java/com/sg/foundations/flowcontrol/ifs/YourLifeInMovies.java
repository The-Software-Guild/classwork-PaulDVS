package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String userName;
        int birthYear;
        
        System.out.println("Hello, please enter your name: ");
        userName = inputReader.nextLine();
        
        System.out.println("Hello " + userName + " please enter your birth year: ");
        birthYear = Integer.parseInt(inputReader.nextLine());
        
        if (birthYear < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if (birthYear < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if (birthYear < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if (birthYear < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (birthYear < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
    }
}
