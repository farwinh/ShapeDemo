/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

import java.util.Scanner;

/**
 *
 * @author nuwan
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputVal;
        GeometryCalculater gc = new GeometryCalculater();
        
        do {
            System.out.println("Please enter the number of the shape :");
            System.out.println(" 1. Sphere \n 2. Cone\n 3. MyShape\n 0. Exit");
            System.out.print("\nEnter your answer :");
            
            inputVal = input.nextInt();
            
            if (inputVal == 0) {
                System.out.println("\nExiting...\n"); 
                //System.exit(0);
            }
            else{
                gc.selectShape(inputVal);
            }
            
        } while (inputVal !=0 );
        
        
        
        
    }
    
}
