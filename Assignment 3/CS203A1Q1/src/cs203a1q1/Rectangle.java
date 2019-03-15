/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a1q1;

import java.text.DecimalFormat;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class Rectangle extends GeometricObject
{
    //declares variables
    private double width;
    private double height;

    public Rectangle()
    {
        super();
    }

    public Rectangle(double width, double height)
    {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super();
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public String toString()
    {
        return "Rectangle Object";
    }

    //made to print our objects values
    public void printAll()
    {
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("The returned larger object is Rectangle Object");
        System.out.println("The area is " + df.format(getArea()));
        System.out.println("The width is " + df.format(getWidth()));
        System.out.println("The height is " + df.format(getHeight()));
        System.out.println("The perimeter is " + df.format(getPerimeter()));

    }

    public double getRadius()
    {
        return 0;
    }

    public double getSide1()
    {
        return 0;
    }

    public double getSide2()
    {
        return 0;
    }

    public double getSide3()
    {
        return 0;
    }

}

/*
 Purpose:
 Arguments:
 Outputs:
 Notes:
 */
