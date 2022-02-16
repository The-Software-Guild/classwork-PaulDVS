package com.sg.foundations.variables;

/**
 *
 * @author Paul van Sittert
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        int butterflies, beetles, bugs;
        
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
        
        //The operator used to show that the dog ate a butterfly is decrement
        //The reason that the number of bugs is unchanged even though butterflies decreased is becaus
        //      the value of bugs was set to a specific value (which was dependant on the current value of butterflies),
        //      it was NOT made dependant on the ongoing value of butterflies.
    }
}
