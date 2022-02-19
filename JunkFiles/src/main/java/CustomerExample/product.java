package CustomerExample;

/**
 *
 * @author Paul van Sittert
 */
public class product {
    private long productID;
    private String productName;
    private double productPrice;
    
    public product(long productID, String productName, double productPrice){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    
    public void displayProduct(){
        System.out.println("ID: "+this.productID + ": Name:" + this.productName + " £" + this.productPrice);
    }
}
