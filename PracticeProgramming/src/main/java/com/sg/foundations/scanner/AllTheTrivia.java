package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String bookName;
        String movieName;
        String planet;
        String trees;
        
        System.out.println("Finish this sentence: Lord of the ");
        bookName = inputReader.nextLine();
        
        System.out.println("Name a christmas movie");
        movieName = inputReader.nextLine();
        
        System.out.println("What planet are we currently on?");
        planet = inputReader.nextLine();
        
        System.out.println("What is the outside of a tree made of?");
        trees = inputReader.nextLine();
        
        System.out.println("Wow I didn't know " + trees + " was a christmas movie");
        System.out.println("My favourite book is Lord of the " + movieName);
        System.out.println("No we don't live in any " + bookName);
        System.out.println("Wrong everyone knows the outside of trees are made of " + planet);
    }
}
