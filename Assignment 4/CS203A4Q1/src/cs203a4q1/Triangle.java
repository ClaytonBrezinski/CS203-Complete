/*
Author: Clayton Brezinski
UserID: 200220989
Date: 
Notes:
*/
package cs203a4q1;
import java.lang.Math;
/*
 *
 * @author Dolan
 */

/*
Purpose:
Notes
*/
public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle()
    {
        return;
    }
    public Triangle(double inSide1, double inSide2, double inSide3) throws IllegalTriangleException
    {
        if ( ((inSide1 + inSide2) < inSide3) == true || ((inSide1 + inSide3) < inSide2) == true || ((inSide2 + inSide3) < inSide1) == true)
        {
            throw new IllegalTriangleException(inSide1, inSide2, inSide3, "One side is larger than the sum of 2 other sides. The larger side is: ");
        }
        if (inSide1 > 0 && inSide2 > 0 && inSide2 > 0 )
        {
            this.side1 = inSide1;
            this.side2 = inSide2;
            this.side3 = inSide3;  
        }
        else
        {
            System.out.println("you have entered either a non positive number. This object will default to a 1x1x1 triangle.");
        }
        return;
    }
    public double getSide1()
    {
        return this.side1;
    }
    public double getSide2()
    {
        return this.side2;
    }
    public double getSide3()
    {
        return this.side3;
    }
    public double getArea()
    {
        double perimeter = this.getPerimeter() / 2;
        return Math.sqrt(perimeter * (perimeter - this.side1)*(perimeter - this.side2)*(perimeter-this.side3));
    }
    public double getPerimeter()
    {
        return (this.side1 + this.side2 + this.side3);
    }
    public String toString()
    {
        return "Triangle: side1 = " + this.side1 + ", side2 = " + this.side2 + ", side3 = " + this.side3;
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/