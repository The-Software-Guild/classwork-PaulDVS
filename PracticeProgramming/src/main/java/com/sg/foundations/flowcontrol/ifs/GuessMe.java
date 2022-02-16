package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class GuessMe {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int answer = 44;
        int userGuess;
        
        System.out.println("I have chosen a number, try and guess it: ");
        userGuess = Integer.parseInt(inputReader.nextLine());
        System.out.println("Your guess: " + userGuess);
        
        if(userGuess == answer){
            System.out.println("Wow, nice guess! That was it!");
        }
        if(userGuess < answer){
            System.out.println("Ha, nice try - too low! I chose " + answer);
        }
        if(userGuess > answer){
            System.out.println("Too bad, way too high. I chose " + answer);
        }
        
        
    }
}
