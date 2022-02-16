package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class TriviaNight {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int currentAnswer;
        int score = 0;
        
        System.out.println("Welcome to trivia night ");
        
        System.out.println("What month's birthstone is Ruby? ");
        System.out.println("1: January. 2: February. 3: April. 4: July? ");
        currentAnswer = Integer.parseInt(inputReader.nextLine());
        
        if(currentAnswer == 4){
            score++;
            System.out.println("Correct. Score:" + score + " 2 questions remaining.");
        } else {
            System.out.println("Incorrect. Score:" + score + " 2 questions remaining.");
        }
        
        System.out.println("What month's birthstone is Amethyst? ");
        System.out.println("1: January. 2: February. 3: April. 4: July? ");
        currentAnswer = Integer.parseInt(inputReader.nextLine());
        
        if(currentAnswer == 2){
            score++;
            System.out.println("Correct. Score:" + score + " 1 questions remaining.");
        } else {
            System.out.println("Incorrect. Score:" + score + " 1 questions remaining.");
        }
        
        System.out.println("What month's birthstone is Opal? ");
        System.out.println("1: October. 2: February. 3: April. 4: July? ");
        currentAnswer = Integer.parseInt(inputReader.nextLine());
        
        if(currentAnswer == 1){
            score++;
            System.out.println("Correct. Score:" + score + " 0 questions remaining.");
        } else {
            System.out.println("Incorrect. Score:" + score + " 0 questions remaining.");
        }
        
        
        if(score == 3){
            System.out.println("Nice job - you got 3 correct!");
        } else if (score == 2){
            System.out.println("Almost there - you got 2 correct");
        } else if (score == 1){
            System.out.println("Better luck next time - you got 1 correct");
        } else if (score == 0){
            System.out.println("AWESOME!");
        } else {
            System.out.println("??? ERROR ???");
        }
    }
}
