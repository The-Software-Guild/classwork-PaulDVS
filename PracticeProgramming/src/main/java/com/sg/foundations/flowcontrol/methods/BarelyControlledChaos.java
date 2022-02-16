package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author Paul van Sittert
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = colourPicker();
        String animal = animalPicker();
        String colorAgain = colourPicker();
        int weight = randNum(5, 201);
        int distance = randNum(10, 21);
        int number = randNum(10000, 20001);
        int time = randNum(2, 7);           

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", " + weight + "lb " + " miniature " + animal + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
    }
    
    public static String colourPicker(){
        Random randomizer = new Random();
        String chosenColour = "";
        int value = randomizer.nextInt(5);
        
        if(value == 0){
            chosenColour = "Blue";
        } else if(value == 1){
            chosenColour = "Red";
        } else if(value == 2){
            chosenColour = "Yellow";
        } else if(value == 3){
            chosenColour = "Green";
        } else if(value == 4){
            chosenColour = "Pink";
        }
        
        return chosenColour;
    }
    
    public static String animalPicker(){
        Random randomizer = new Random();
        String chosenAnimal = "";
        int value = randomizer.nextInt(5);
        
        if(value == 0){
            chosenAnimal = "Fox";
        } else if(value == 1){
            chosenAnimal = "Cat";
        } else if(value == 2){
            chosenAnimal = "Dog";
        } else if(value == 3){
            chosenAnimal = "Hamster";
        } else if(value == 4){
            chosenAnimal = "Owl";
        }
        
        return chosenAnimal;
    }
    
    public static int randNum(int x, int y){
        Random randomizer = new Random();
        int value = randomizer.nextInt(y-x)+x;
        return value;
    }
}
