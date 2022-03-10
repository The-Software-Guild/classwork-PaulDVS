package InstanceVariables;
/**
 *
 * @author Paul van Sittert
 */
public class Products {
    int productId;
    String productName;
    
    {
        productId = 2;
        productName = "Hero Honda Bike";
        System.out.println(this.productId + " " + this.productName);
    }
    
    public Products(){
        this.productId =1;
        this.productName = "Acer Aspire";
        System.out.println(this.productId + " " + this.productName);
    }
    
    public void display(){
        this.productId = 5;
        this.productName = "Washing machine";
        System.out.println(this.productId + " " + this.productName);
    }
}
