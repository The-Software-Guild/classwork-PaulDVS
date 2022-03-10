package NumberReverse;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class Main {
    public static void main (String args[]){
        Scanner inputReader = new Scanner(System.in);
        Reverse reverse = new Reverse();
        
        System.out.println("Please enter the number to reverse ");
        reverse.setnumber(Integer.parseInt(inputReader.nextLine()));
        
        
        System.out.println("The reverse is " + reverse.getreverseNumber());
    }
}
