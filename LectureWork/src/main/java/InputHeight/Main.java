package InputHeight;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class Main {
    public static void main (String args[]){
        Scanner inputReader = new Scanner(System.in);
        
        int heightFeet;
        int heightInches;
        
        System.out.println("Please enter your height: ");
        System.out.println("Feet: ");
        heightFeet = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Inches: ");
        heightInches = Integer.parseInt(inputReader.nextLine());
        
        Height userHeight = new Height(heightFeet, heightInches);
        
        int returnedFeet = userHeight.getFeet();
        int returnedInches = userHeight.getInches();
        
        System.out.println("User height is " + returnedFeet + " foot " + returnedInches + " inches");
    }
}
