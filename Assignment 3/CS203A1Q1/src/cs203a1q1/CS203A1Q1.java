/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package cs203a1q1;

import java.util.Scanner;
import java.util.InputMismatchException;
/**

 @author Dolan
 */
public class CS203A1Q1
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // get the sides of each triangle
        System.out.println("enter three sides: ");
        Scanner input = new Scanner(System.in);
        double[] sideLengths = new double[3];
        for (int counter = 0; counter < 3; counter++)
        {   
            try
            {
                sideLengths[counter] = input.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("please enter an integer or double for the sides of the triangle");
                input.nextLine();
                counter --;
            }
            
        }
        // get the colour of the triangle and if it is filled or not
        String inColor = "";
        Boolean inFilled = false;
        boolean done = false;
        while (done == false)
        {
            try
            {
            done = true;
            System.out.println("enter the color: ");
            inColor = input.next();
            System.out.println("Enter a boolean vlaue for filled:");
            inFilled = input.nextBoolean();
            }
            catch(InputMismatchException e)
            {
                input.nextLine();
                done = false;
            }
        }
        // set the traingles properties to that of what the user has specified
        Triangle firstTriangle = new Triangle(sideLengths[0], sideLengths[1], sideLengths[2]);
        firstTriangle.setFilled(inFilled);
        firstTriangle.setColor(inColor);

        System.out.println("Area: " + firstTriangle.getArea());
        System.out.println("Perimeter: " + firstTriangle.getPerimeter()); 
        System.out.println("Color: " + firstTriangle.getColor());
        System.out.println("Filled: " + firstTriangle.isFilled());
    }

}
