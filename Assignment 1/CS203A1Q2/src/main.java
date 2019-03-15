/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
import java.lang.Math;
import java.util.Scanner;

/*
 Purpose: Computes the area in between 3 pairs of x,y points 
 Notes:
 */
public class main
{

    /*
    Purpose: This class takes requests the user to input the 3 sets of coordinates, places them into an array, and then calls on the triangleArea function to 
             compute the area of the resulting triangle formed between the 2 points
    Arguements: args
    Outputs: String - a printout of the area of the triangle
    Notes:
    */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // request user input with a spacce between each variable
        double[] inputArray = new double[6];
        System.out.println("Please enter 3 points for a triangle with a space in between each entry");
        String[] userInput = input.nextLine().split(" ");
        for (int i = 0; i < 6; i++)
        {
            try
            {
                inputArray[i] = Double.parseDouble(userInput[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("there was an error with your entry, that entry has been defaulted to 1.0");
                inputArray[i] = 1.0;
            }
        }
        double[] cordA ={inputArray[0], inputArray[1]};
        double[] cordB ={inputArray[2], inputArray[3]};
        double[] cordC ={inputArray[4], inputArray[5]};

        double triangleArea = calculateTriangleArea(cordA, cordB, cordC);
        System.out.println("The area of the triangle is: " + roundDouble(triangleArea));
    }

    /*
    Purpose: calculates the area of a triangle by getting the side length between each set of points and then preforming a sqrt(s(s-side1)(s-side2)(s-side3))
    Arguements:double[], double[], double[] - each combination of X and y Coordingates 
    Outputs: double - the value of the size of the area
    Notes:
    */
    private static double calculateTriangleArea(double[] cordA, double[] cordB, double[] cordC)
    {
        double sideLength1 = calculateSideLength(cordA, cordB);
        double sideLength2 = calculateSideLength(cordB, cordC);
        double sideLength3 = calculateSideLength(cordC, cordA);

        double s = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.sqrt(s * (s - sideLength1) * (s - sideLength2) * (s - sideLength3));
    }
    
    /*
    Purpose: calculates the distance between the 2 sets of points given
    Arguements: double[], double[] - the 2 sets of coordinates
    Outputs: double - the distance between the 2 points. 
    Notes:
    */
    private static double calculateSideLength(double[] cordA, double[] cordB)
    {
        double xCordDiff = cordA[0] - cordB[0];
        double yCordDiff = cordA[1] - cordB[1];
        return Math.sqrt(xCordDiff * xCordDiff + yCordDiff * yCordDiff);
    }

    /*
    Purpose: rounds the given input to 2 decimal places for a better form factor
    Arguements: double - the double we wish to round
    Outputs: string - the now rounded double
    Notes:
    */
    private static String roundDouble(double variable)
    {
        return String.format("%.2f", variable);
    }
}
