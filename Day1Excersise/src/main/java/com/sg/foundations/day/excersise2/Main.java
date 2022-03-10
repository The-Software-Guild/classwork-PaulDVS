package com.sg.foundations.day.excersise2;
/**
 *
 * @author Paul van Sittert
 */
public class Main {
    public static void main (String args[]){
        Standard newClass = new Standard();
        
        System.out.println("Class of 2022");
        System.out.println(newClass.displayClass());
        
        System.out.println("");
        System.out.println("The student with the highest percentage is");
        System.out.println(newClass.highestPercentage());
        
        System.out.println("");
        System.out.println("The student with the highest marks in mathematics is");
        System.out.println(newClass.highestMaths());
    }
}
