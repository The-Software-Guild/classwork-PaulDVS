
import java.util.Scanner;

/*
 *
 * Author Paul van Sittert
 * Date: 15.2.22
 * 
 */
public class WindowMaster {

    public static void main(String [] args) {
        String inputHeight;
        String inputWidth;
        String inputGlassCost;
        String inputTrimCost;
        String inputNumWindows;
        float height = 0;
        float width = 0;
        float areaOfWindow = 0;
        float perimeterOfWindow = 0;
        float glassCost = 0;
        float trimCost = 0;
        int numWindows = 0;
        float cost;
        
        boolean isValid = false;
        
        Scanner myScanner = new Scanner(System.in);
        
        do{
            try{
                System.out.println("Please input the number of windows: ");
                inputNumWindows = myScanner.nextLine();
                numWindows = Integer.parseInt(inputNumWindows);
                
                if(numWindows > 0){
                    isValid = true;
                };
                
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid Number of Windows.");
            }
            
        }while(!isValid);
        isValid = false;
        
        do{
            try{
                System.out.println("Please input the height of the window: ");
                inputHeight = myScanner.nextLine();
                height = Float.parseFloat(inputHeight);
                
                if(height > 0){
                    isValid = true;
                };
                
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid height.");
            }
            
        }while(!isValid);
        isValid = false;
        
        do{
            try{
                System.out.println("Please input the width of the window: ");
                inputWidth = myScanner.nextLine();
                width = Float.parseFloat(inputWidth);
                
                if(width > 0){
                    isValid = true;
                };
                
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid Width.");
            }
            
        }while(!isValid);
        isValid = false;
        
        do{
            try{
                System.out.println("Please input the cost of the Window Glass: ");
                inputGlassCost = myScanner.nextLine();
                glassCost = Float.parseFloat(inputGlassCost);
                
                if(glassCost > 0){
                    isValid = true;
                };
                
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid Glass cost.");
            }
            
        }while(!isValid);
        isValid = false;
        
        do{
            try{
                System.out.println("Please input the cost of the Trim: ");
                inputTrimCost = myScanner.nextLine();
                trimCost = Float.parseFloat(inputTrimCost);
                
                if(trimCost > 0){
                    isValid = true;
                };
                
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid Trim cost");
            }
        }while(!isValid);

        areaOfWindow = height * width;
        perimeterOfWindow = 2*(height + width);
        
        cost = numWindows*((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        
        System.out.println("Number of windows " + numWindows);
        System.out.println("Window Height: " + height);
        System.out.println("Window Width: " + width);
        System.out.println("Window Area: " + areaOfWindow);
        System.out.println("Window Perimeter: " + perimeterOfWindow);
        System.out.println("Windows Cost: " + cost);
    }
}
