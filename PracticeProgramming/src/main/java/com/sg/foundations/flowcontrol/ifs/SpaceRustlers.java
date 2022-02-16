package com.sg.foundations.flowcontrol.ifs;
/**
 *
 * @author Paul van Sittert
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else{
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
        
        //If is a conditional statement wherby the associated code only triggers if the condition is met.
        //else if is a conditional statement that is only run if the preceding if statement has been run and is false.
        
        //Removing the else from else if just means that the if statement will be evaluated regardless of the outcome of the preceding if statement
    }
}
