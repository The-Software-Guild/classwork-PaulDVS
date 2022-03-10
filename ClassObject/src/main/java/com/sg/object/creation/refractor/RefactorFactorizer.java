package com.sg.object.creation.refractor;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class RefactorFactorizer {
    public void Factorise(){
        Scanner inputReader = new Scanner(System.in);
        int userNum;
        int factorNum = 0;
        int factorAdd = 0;
        
        System.out.println("Please enter the number to factor: ");
        userNum = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("The factors of " +userNum+ " are:");
        
        
        for(int i = 1; i < userNum; i++){
            if((userNum % i) == 0){
                factorNum++;
                factorAdd += i;
                System.out.print(i + " ");
            }
        }
        
        System.out.println(userNum);
        System.out.println(+userNum+ " has " +(factorNum+1)+ " factors");
        
        
        if(factorAdd == userNum){
            System.out.println(userNum + " is a perfect number");
        }else{
            System.out.println(userNum + " is not a perfect number");
        };
        
        if(factorAdd == 1){
            System.out.println(userNum + " is a prime number");
        }else{
            System.out.println(userNum + " is not a prime number");
        };
    }
}
