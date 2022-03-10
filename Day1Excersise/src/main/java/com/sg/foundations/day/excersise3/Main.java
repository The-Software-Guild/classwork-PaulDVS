package com.sg.foundations.day.excersise3;
/**
 *
 * @author Paul van Sittert
 */
public class Main {
    public static void main (String args[]){
        MatricesCalculator myCalculator = new MatricesCalculator();
        
        int matricesSum[][];
        
        matricesSum=myCalculator.getSum();
        
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                System.out.println("The sum of cell ["+i+"}["+j+"] is " + matricesSum[i][j]);
            }
        }
    }
}
