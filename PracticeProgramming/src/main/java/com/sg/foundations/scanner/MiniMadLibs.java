package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double number;
        String noun1, adjective1, noun2, adjective2, pNoun1, pNoun2, pNoun3, verb1, verb2;
        
        System.out.println("Please enter a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please enter a noun: ");
        noun1 = inputReader.nextLine();
        
        System.out.println("Please enter another noun: ");
        noun2 = inputReader.nextLine();
        
        System.out.println("Please enter a plural noun: ");
        pNoun1 = inputReader.nextLine();
        
        System.out.println("Please enter another plural noun: ");
        pNoun2 = inputReader.nextLine();
        
        System.out.println("Please enter a final plural noun: ");
        pNoun3 = inputReader.nextLine();
        
        System.out.println("Please enter an adjective: ");
        adjective1 = inputReader.nextLine();
        
        System.out.println("Please enter another adjective: ");
        adjective2 = inputReader.nextLine();
        
        System.out.println("Please enter a present tense verb: ");
        verb1 = inputReader.nextLine();
        
        System.out.println("Please enter the same verb but in past tense: ");
        verb2 = inputReader.nextLine();
        
        
        System.out.println(noun1+": the " +adjective1+ " frontier. These are the voyages of the starship " +noun2+ ". Its " +number+ "-year mission: to explore strange " +adjective2+ " " +pNoun1+ ", to seek out " +adjective2+ " " +pNoun2+ " and " +adjective2+ " " +pNoun3+ ", to boldly " +verb1+ " where no one has " +verb2+ " before");
        
    }
}

        