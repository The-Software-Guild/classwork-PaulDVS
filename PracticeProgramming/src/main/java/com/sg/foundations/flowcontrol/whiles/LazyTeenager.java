package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Paul van Sittert
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer = new Random();
        boolean roomClean = false;
        int counter = 1;
        
        do{
            System.out.println("Clean your room! (x" + counter + ")");
            counter++;
            
            if(randomizer.nextInt(10) < counter){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                roomClean = true;
            }
            
            if(counter == 7 && !roomClean){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        }while (!roomClean);
    }
}
