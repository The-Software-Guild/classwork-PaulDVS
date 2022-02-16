package com.sg.foundations.flowcontrol.whiles;
/**
 *
 * @author Paul van Sittert
 */
public class WaitAWhile {
    public static void main(String[] args) {
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; 
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
        
        //If you change bedTime to 11, then the while loop loops for one more loop and reaches 11 o clock
        //If you change timeNow to 11 but leav bedtime at ten, then the loop will continue forever slowly increasing.
        //If you comment out timeNow++ then the loop will continue forever, stuck on 5 oclock.
    }
}
