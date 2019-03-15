/*
Author: Clayton Brezinski
Student ID: 200220989
Notes: This has altered the Triangle class to throw an exception if the user enteres impossible lengths for the sides of the triangle. To test this addition, 
        I have created 2 triangles, 1 with correct side lengths and 1 with incorrect side lengths (b). The correct triangle will print it's area and perimeter
        and the incorrect triangle will print it's side length and an additional error message
*/
package cs203a4q1;

/**

 @author Dolan
 */
public class CS203A4Q1
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            Triangle a = new Triangle(1,1,1);
            // print the legal triangle's perimeter and area
            System.out.println("Area: " + a.getArea() + ", Perimeter: " + a.getPerimeter());
            Triangle b = new Triangle(1,2,4);
            // we will never get here, but I am leaving it in for the TA's testing purposes
            System.out.println("Area:" + b.getArea() + ", Perimeter: " + b.getPerimeter());
        }
        catch(IllegalTriangleException ite)
        {
            double[] sides = ite.getSidesOfTriangle();
            
            for (int i = 0; i < sides.length; i++)
            {
                System.out.print(sides[i] + " ");
                if (i == sides.length - 1)
                {
                    System.out.print('\n');
                }
            }
            System.out.println(ite.getMessage());
        }
    }
}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/