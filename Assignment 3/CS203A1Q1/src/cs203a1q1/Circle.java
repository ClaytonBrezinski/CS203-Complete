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
public class Circle extends GeometricObject
{

    private double radius = 0;

    public Circle()
    {
        super();
        radius = 1;
    }

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    public String toString()
    {
        return "Circle Object";
    }

    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + radius);
    }

    public void printAll()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The returned larger object is Circle Object");
        System.out.println("The area is " + df.format(getArea()));
        System.out.println("The radius is " + df.format(getRadius()));
        System.out.println("The perimeter is " + df.format(getPerimeter()));
    }

    public double getWidth()
    {
        return 0;
    }

    public double getHeight()
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
