/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
import java.lang.NumberFormatException;

/*
Purpose: This program requests users to enter integers from the command line
Notes: if the user enters an incorrect value, it defaults to 0
*/
public class Sum
{
    /*
    Purpose: takes in the number of arguements and loops through them, if there is a non accepted value, notify the user and set it as 0
    Arguements: String[] - user entered arguements
    Outputs: N/A - printed to the command line
    Notes:
    */
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
        {
            int singleValue = 0;
            try
            {
                singleValue = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("incorrect variable entered in element " + i + " this value is defaulting to zero");
                singleValue = 0;
            }
            sum += singleValue;
        }
        System.out.println("the sum is: " + sum);
    }
}
