/**
 *
 * @author Admin
 */
public class main {
    public static void main (String args[]){
        address add1 = new address("Glasgow", "Scotland");
        employee emp1 = new employee(1, "Alex", add1);
        emp1.display();
    }
}
