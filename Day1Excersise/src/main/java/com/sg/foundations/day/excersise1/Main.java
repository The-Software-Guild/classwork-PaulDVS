package com.sg.foundations.day.excersise1;

import java.util.Scanner;

/**
 *
 * @author Paul van Sittert
 */
public class Main {
    public static void main (String args[]){
        Scanner inputReader = new Scanner(System.in);
        
        int eggs;
        
        System.out.println("Please enter the number of eggs: ");
        eggs = Integer.parseInt(inputReader.nextLine());
        
        EggCount basket = new EggCount(eggs);
        
        System.out.println("There are " + basket.getGrossEggs() + " Gross, " + basket.getDozenEggs() + " Dozen and " + basket.getEggs() + " left over eggs.");
    }
}
