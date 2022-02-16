package com.sg.foundations.variables;

/**
 *
 * @author Paul van Sittert
 */
public class InABucket {
    public static void main(String[] args) {
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 5.0f;
        grainsOfSand = 5476;
        
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("The weight of a teacup pig is " + weightOfTeacupPig + "Kg");
        System.out.println("In a hourglass there are " + grainsOfSand + " grains of sand");
    }
}
