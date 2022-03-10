package CustomerExample;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class customer {
    private long customerID;
    private String customerName;
    private product[] productArray;
    private product[] cart = new product[12];
    private int cartFill = 0;
    
    public void customerDetails(){
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please enter your id ");
        this.customerID = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please enter your name ");
        this.customerName = inputReader.nextLine();
    }
    
    public void restock(){
        product product1 = new product(1, "Laptop", 1200.00);
        product product2 = new product(2, "Mobile Phone", 800.00);
        product product3 = new product(3, "Headphones", 9.99);
        product product4 = new product(4, "RGB Keyboard", 40.00);
        
        product[] tempArray = {product1, product2, product3, product4};
        this.productArray = tempArray;
    }
    
    public void displayStock(){
        for(int i = 0; i < this.productArray.length; i++){
            this.productArray[i].displayProduct();
        }
    }
    
    public void buyProduct(int x){
        if(this.cartFill< this.cart.length){
            this.cart[cartFill] = this.productArray[x];
            this.cartFill++;
        } else {
            System.out.println("Sorry but your cart is full");
        }
    }
    
    public void displayCart(){
        System.out.println("");
        System.out.println("Shopping cart of ID:" +this.customerID + " Name:" + this.customerName);
        
        for(int i = 0; i < this.cart.length; i++){
            if(this.cart[i] != null){
                this.cart[i].displayProduct();
            }
        }
    }
}
