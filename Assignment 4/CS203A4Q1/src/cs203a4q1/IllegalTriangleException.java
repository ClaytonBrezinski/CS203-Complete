/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package cs203a4q1;

/**

 @author Dolan
 */
public class IllegalTriangleException extends Exception
{
    private String message;
    private double[] sides = new double[3];
    /**
     Creates a new instance of <code>IllegalTriangleException</code> without detail message.
     */
    public IllegalTriangleException()
    { 
    }

    /**
     Constructs an instance of <code>IllegalTriangleException</code> with the specified detail message.

     @param msg the detail message.
     */
    public IllegalTriangleException(double side1, double side2, double side3, String message)
    {
        super(message);
        if (((side1 + side2) < side3) == true)
        {
            message += "side3";
        }

        if (((side1 + side3) < side2) == true)
        {
            message += "side2";
        }

        if (((side2 + side3) < side1) == true)
        {
            message += "side1";
        }
        this.message = message;
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;
    }

    public double[] getSidesOfTriangle()
    {
        return this.sides;
    }
    @Override
    public String getMessage()
    {
        return this.message;
    }

}
