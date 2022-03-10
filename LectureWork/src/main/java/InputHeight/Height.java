package InputHeight;
/**
 *
 * @author Paul van Sittert
 */
public class Height {
    private int feet;
    private int inches;
    
    public Height(int heightFeet, int heightInches){
        this.feet = heightFeet;
        
        while(heightInches > 11){
            this.feet +=1;
            heightInches -= 12;
        }
        
        this.inches = heightInches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
    
    
}
