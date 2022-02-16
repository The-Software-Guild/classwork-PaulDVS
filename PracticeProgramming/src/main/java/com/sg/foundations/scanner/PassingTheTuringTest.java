package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String yourName;
        String aiName = "Steve";
        String favColour;
        String faveFood;
        String favNumber;
        
        System.out.println("Hello. what's your name?");
        yourName = inputReader.nextLine();
        
        System.out.println("Hello " + yourName + ", my name is " + aiName);
        
        System.out.println("What's your favourite Colour?");
        favColour = inputReader.nextLine();
        
        System.out.println("What's your favourite Food?");
        faveFood = inputReader.nextLine();
        
        System.out.println("What's your favourite Number?");
        favNumber = inputReader.nextLine();
        
        System.out.println("Hey look, I just saw " + favNumber + " " + favColour + " " + faveFood + "!");
        
    }
}
