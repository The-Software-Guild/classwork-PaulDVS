package com.sg.foundations.exercises;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Paul van Sittert
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random randomizer = new Random();
        
        int currentDollars;
        int maxDollars;
        int currentRoll = 0;
        int maxRoll = 0;
        int dice;
        
        System.out.println("How many dollars do you have? ");
        currentDollars = Integer.parseInt(inputReader.nextLine());
        maxDollars = currentDollars;
        
        while(currentDollars>0){
            dice = randomizer.nextInt(7)+1;
            
            if(dice == 7){
                currentDollars += 4;
                if(currentDollars>maxDollars){
                    maxDollars = currentDollars;
                    maxRoll = currentRoll;
                }
            } else {
                currentDollars -= 1;
            }
            currentRoll++;
        }
        
        System.out.println("You are broke after " +currentRoll+ " rolls");
        System.out.println("You should have quit after " +maxRoll+ " rolls when you had $" + maxDollars);
    }
}
