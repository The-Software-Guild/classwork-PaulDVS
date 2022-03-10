package com.sg.object.creation.refractor;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class App {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        RefactorFactorizer factorise = new RefactorFactorizer();
        RefactorLuckySevens luckysevens = new RefactorLuckySevens();
        RefactorInterestCalculator interestCalculator = new RefactorInterestCalculator();
        RefactorRockPaperScissors gameRockPaperScissors = new RefactorRockPaperScissors();
        
        System.out.println("Please enter the program to run: ");
        System.out.println("1: factorise. 2: Lucky sevens.");
        System.out.println("3: Interest calculator. 4: Rock, Paper, Scissors ");     
        int userNum = Integer.parseInt(inputReader.nextLine());
        
        if(userNum ==1){
            factorise.Factorise();
        } else if(userNum ==2){
            luckysevens.playLuckySevens();
        } else if(userNum ==3){
            interestCalculator.calculateInterest();
        } else if(userNum ==4){
            gameRockPaperScissors.playRockPaperScissors();
        }
        
    }
}
