/*
Author: Clayon Brezinski
Student ID: 200220989
Notes: This program showcases the exception heirarchy from Q3 and demonstrates that if you want to catch every exception, you must have an intentional order
within your catch block. With a catch block with the superclass at the front, and all the that classes extend from it after you will get an error from the JVM
because you would always hit the superclass exception first. Instead, you want to place the the class that is the child of everything, and then its parent 
after that. 
 */
package cs203a3q4;

import java.util.Random;

public class CS203A3Q4
{

    public static void main(String[] args)
    {
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            try
            {
                someMethod();
            }
            catch (ExceptionC c)
            {
                System.out.println("We caught a exceptionC here, this exception is: " + c.toString() + '\n');
            }
            catch (ExceptionB b)
            {
                System.out.println("We caught a exceptionB here, this exception is: " + b.toString() + '\n');
            }
            catch (ExceptionA a)
            {
                System.out.println("We caught a exceptionC here, this exception is: " + a.toString() + '\n');
            }
            catch (Exception e)
            {
                System.out.println("We caught an exception here, this exception is: " + e.toString() + '\n');
            }
        }
    }
    /*
    Purpose: randomly generates a number and from that throws a different exception each run
    Arguements: N/A
    Outputs: returns an exception of either default, A, B, or C each time
    Notes:N/A
    */
    public static void someMethod() throws Exception, ExceptionA, ExceptionB, ExceptionC
    {
        Random numGenerator = new Random();
        int randomInt = numGenerator.nextInt(100);
        if (randomInt <= 25)
        {
            System.out.println("Thowing Exception A");
            throw new ExceptionA();
        }
        else if (randomInt <= 50 && randomInt > 25)
        {
            System.out.println("Thowing Exception B");
            throw new ExceptionB();
        }
        else if (randomInt <= 75 && randomInt > 50)
        {
            System.out.println("Thowing Exception C");
            throw new ExceptionC();
        }
        else if (randomInt <= 100 && randomInt > 75)
        {
            System.out.println("Thowing Exception");
            throw new Exception();
        }
    }
}
