package CustomerExample;

/**
 *
 * @author Paul van Sittert
 */
public class customer {
    private long customerID;
    private String customerName;
    private product[] productArray;
    private product[] cart;
    private int cartFill;
    
    public customer(long customerID, String customerName, product[] productArray){
        this.customerID = customerID;
        this.customerName = customerName;
        this.productArray = productArray;
        this.cart = new product[12];
        this.cartFill = 0;
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
