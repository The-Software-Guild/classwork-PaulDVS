package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class MiniZork {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = inputReader.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = inputReader.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = inputReader.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {System.out.println("You've been eaten by a grue.");}
        } else if (action.equals("go to the house")) { 
            System.out.println("Break down the door or try the cellar.");
            action = inputReader.nextLine();
            
            if (action.equals("break down the door")) {
                System.out.println("WHile tryig to break down the door you get a splinter.");
                System.out.println("You give up and go home.");
            } else if (action.equals("try the cellar")) {
                System.out.println("You arrive in the cellar, it is lit by a small bulb and you can see a package on the ground.");
                System.out.println("Turn off the light or open package.");
                action = inputReader.nextLine();
                
                if (action.equals("turn off the light")) {
                    System.out.println("The cellar goes dark.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("open package")) {
                    System.out.println("You open the package and find your missing torch.");
                    System.out.println("You head home, your quest complete.");
                }
            }
        }
    }
}
