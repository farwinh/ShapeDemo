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
public class GeometryCalculater {
    //1. need to select the shape
    //2. need to get the user inputs
    //3. need to display the volume
    Scanner input = new Scanner(System.in);
    double sRadius, cRadius, cHeight, myRadius, myHeight, sVolume, cVolume, myVolume;
    
    public void selectShape(int shape){
        switch (shape){
            case 1:
                System.out.println("\nYou have select the Sphere\n");
                System.out.print("Please enter value for the radius :");
                sRadius = input.nextDouble();
                System.out.printf("Volume of the sphere is : %.2f\n\n",getSphereVolume(sRadius));
                break;
            case 2:
                System.out.println("\nYou have select the Cone");
                System.out.print("Please enter value for the radius :");
                cRadius = input.nextDouble();
                System.out.print("Please enter value for the height :");
                cHeight = input.nextDouble();
                System.out.printf("Volume of the cone is : %.2f\n\n",getConeVolume(cRadius, cHeight));
                break;
            case 3:
                System.out.println("\nYou have select the MyShape");
                System.out.print("Please enter value for the radius :");
                myRadius = input.nextDouble();
                System.out.print("Please enter value for the height :");
                myHeight = input.nextDouble();
                System.out.printf("Volume of the cone is : %.2f\n\n",getMyShapeVolume(cRadius, cHeight));
                break;
            default:
                System.out.println("\nPlease select a valid number from the menu");
        }
    }
    
    private double getSphereVolume(double radius){
        sVolume = (4 * Math.PI * radius * radius * radius)/(3.0);
        return sVolume;
    }
    
    private double getConeVolume(double radius, double height){
        cVolume = (Math.PI * radius * radius * height)/(3.0);
        return cVolume;
    }

    private double getMyShapeVolume(double radius, double height) {
        myVolume = getConeVolume(radius, height) + getSphereVolume(radius)/2;
        return myVolume;
    }
}
