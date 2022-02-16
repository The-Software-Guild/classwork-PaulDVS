package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class GuessMeMore {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner inputReader = new Scanner(System.in);
        
        int answer = randomizer.nextInt(201) - 100;
        int userGuess;
        
        System.out.println("I have chosen a number between -100 to 100, try and guess it: ");
        userGuess = Integer.parseInt(inputReader.nextLine());
        System.out.println("Your guess: " + userGuess);
        
        if(userGuess == answer){
            System.out.println("Wow, nice guess! That was it!");
        } else {
            if(userGuess < answer){
                System.out.println("Ha, nice try - too low!");
            }
            if(userGuess > answer){
                System.out.println("Too bad, way too high");
            }

            System.out.println("Try again ");
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
}
