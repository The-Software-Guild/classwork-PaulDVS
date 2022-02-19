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
        int custID;
        String custName;
        int productID;
        
        product product1 = new product(1, "Laptop", 1200.00);
        product product2 = new product(2, "Mobile Phone", 800.00);
        product product3 = new product(3, "Headphones", 9.99);
        product product4 = new product(4, "RGB Keyboard", 40.00);
        
        product[] tempArray = {product1, product2, product3, product4};
        
        System.out.println("Please enter your id ");
        custID = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please enter your name ");
        custName = inputReader.nextLine();
        
        customer currentCustomer = new customer(custID, custName,tempArray);
        
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
