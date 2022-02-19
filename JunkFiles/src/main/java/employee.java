/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class employee {
    int empID;
    String name;
    address address;
    
    public employee(int empID,String name, address address){
        this.empID = empID;
        this.name = name;
        this.address = address;
    }
    
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.address.country);
    }
}
