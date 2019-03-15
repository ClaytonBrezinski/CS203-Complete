/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
import java.lang.Math;
import java.util.Scanner;
import java.lang.NumberFormatException;

/*
Purpose: prints out the total cost of an individuals phone bill based on their peak and evening minutes

Notes:
*/
public class PhoneBill
{
    /*
    Purpose: receives the user's peak and evening minutes from the command line, checks for incorrect varaibles and tells the user, and then returns the 
             calculated price of the user's phonebill
    Arguements: N/A
    Outputs: String - the user's calculated bill at the end of the month. 
    Notes: this program will account for it the user enters a negative number, if so, it will not add it to the sum
    */
    public static void main(String[] args)
    {
        int inPeakMinutes = 0;
        int inEveningMinutes = 0;
        try
        {
            inPeakMinutes =Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("incorrect variable for the peak minutes");
            return;
        }
        try
        {
            inEveningMinutes = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("incorrect variable for the evening minutes");
            return;
        }
        
        if ((inPeakMinutes < 0) || (inEveningMinutes < 0))
        {
            System.out.println("You entered a negative variable, this is not possible");
            return;
        }
        
        double totalCost = 19.99;
        if (inPeakMinutes > 200)
        {
            totalCost += (inPeakMinutes - 200) * 0.30;
        }
        if (inEveningMinutes > 500)
        {
            totalCost += (inEveningMinutes - 500) * .15;
        }
        System.out.println("Monthly bill = $" + totalCost);
    }
}
