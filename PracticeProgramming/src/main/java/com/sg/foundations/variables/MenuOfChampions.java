package com.sg.foundations.variables;

/**
 *
 * @author Paul van Sittert
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        String restaurantName = "Wooden elk cafe";
        
        String food1 = "Bean Soup";
        double price1 = 2.50;
        
        String food2 = "BLT";
        double price2 = 4.50;
        
        String food3 = "Steak";
        double price3 = 8.00;
        
        System.out.println("Hello and welcome to " + restaurantName);
        System.out.println("Todays Menu is ");
        System.out.println("--------------------------------------------------------");
        System.out.println(food1 + ": £" + price1);
        System.out.println("");
        System.out.println(food2 + ": £" + price2);
        System.out.println("");
        System.out.println(food3 + ": £" + price3);
        System.out.println("");
        
        
    }
}
