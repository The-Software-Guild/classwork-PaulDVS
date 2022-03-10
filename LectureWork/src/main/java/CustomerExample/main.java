package CustomerExample;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class main {
    public static void main (String args[]){
        Scanner inputReader = new Scanner(System.in);
        
        int continueShopping;
        int productID;
        
        customer currentCustomer = new customer();
        currentCustomer.customerDetails();
        currentCustomer.restock();
        
        
        System.out.println("");
        System.out.println("Hello and welcome to the store");
        
        do{
            continueShopping = 0;
            
            System.out.println("");
            System.out.println("Products:");
            currentCustomer.displayStock();
            
            System.out.println("");
            System.out.println("Please enter the ID of the product you want to buy: ");
            productID= (Integer.parseInt(inputReader.nextLine())-1);
            currentCustomer.buyProduct(productID);
            
            System.out.println("");
            System.out.println("Enter 1 to continue shopping");
            continueShopping = Integer.parseInt(inputReader.nextLine());
            
        }while(continueShopping == 1);
        
        currentCustomer.displayCart();
        System.out.println("Thank you for shopping!");

    }
}
