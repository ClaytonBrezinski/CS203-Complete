/*
Author: Clayton Brezinski
UserID: 200220989
Date: 
Notes:
*/
package cs203a1q1;
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
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle()
    {
        return;
    }
    public Triangle(double inSide1, double inSide2, double inSide3)
    {
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