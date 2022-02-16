package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        
        //If .equals is changed to == then the if statement would never run, as == is only used to compare numbers not string
        //If you dont have the right capitalisation, then the if statement will return false
            //To fix this either: include and or statement for other capitalisation, or just use a function to remove capitalisation.
    }
}
