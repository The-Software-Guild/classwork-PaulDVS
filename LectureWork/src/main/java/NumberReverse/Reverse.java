package NumberReverse;
/**
 *
 * @author Paul van Sittert
 */
public class Reverse {
    private int number;
    private int reverseNumber;

    public void setnumber(int number) {
        this.number = number;
    }

    public int getreverseNumber() {
        this.reverseFunction();
        return this.reverseNumber;
    }
    
    private void reverseFunction(){
        while(this.number != 0){
            this.reverseNumber *= 10;
            this.reverseNumber +=  this.number % 10;
            
            this.number -= this.number % 10;
            this.number /= 10;
        }
    }
}
