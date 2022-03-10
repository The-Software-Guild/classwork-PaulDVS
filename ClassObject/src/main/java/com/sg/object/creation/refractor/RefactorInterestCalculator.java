package com.sg.object.creation.refractor;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class RefactorInterestCalculator {
    public void calculateInterest(){
        Scanner inputReader = new Scanner(System.in);
        
        double principal;
        int years;
        double growth;
        int compound;
        int compoundPeriod =0;
        double yearStart;
        double yearEnd;
        double earned;
        
        
        System.out.println("How much do you want to invest? ");
        principal = Double.parseDouble(inputReader.nextLine());
        yearStart = principal;
        
        System.out.println("How many years are investing? ");
        years = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is the annual interest rate % growth? ");
        growth = Double.parseDouble(inputReader.nextLine());
        
        System.out.println("How often does the capital compound? 1: Quarterly. 2: Monthly. 3: Daily ");
        compound = Integer.parseInt(inputReader.nextLine());
        
        if(compound == 1){
            compoundPeriod=4;
        } else if(compound == 2){
            compoundPeriod=12;
        } else if(compound == 3){
            compoundPeriod=365;
        }
        
        
        System.out.println("");
        System.out.println("Calculating...");
        
        for(int i = 0; i < years; i++){
            System.out.println("Year " + (i+1) +":");
            System.out.println("Began with £" + yearStart);
            
            yearEnd = yearStart;
            for(int j = 0; j<compoundPeriod; j++){
                yearEnd = yearEnd *(1+growth/(compoundPeriod*100));
            }
             
            earned = yearEnd-yearStart;
            
            System.out.println("Earned  £" + earned);
            System.out.println("Ended with £" + yearEnd);
            
            yearStart = yearEnd;
        }
    }
}
