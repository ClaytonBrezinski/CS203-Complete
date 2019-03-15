/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
package cs203a1q5;

import java.util.Scanner;
import java.lang.NumberFormatException;

/*
Purpose: Returns the sum of all the user inputed numbers
Notes:
*/
public class CS203A1Q5
{
    /*
    Purpose: Requests the user to input integers within the IDE and when they hit enter it will return the sum of all the integers entered. 
    Arguements: n/A
    Outputs: String - the value of all the numbers inputted added together
    Notes: will set any unknown value to 0;
    */
    public static void main(String[] inVals)
    {
        Scanner input = new Scanner(System.in);  // Reading from System.in
        int totalSum = 0;
        System.out.println("Enter a list of variables you would like to add to the sum with a space in between each entry, press enter to receive the sum");
        String userInput = input.nextLine();
        String[] inputArray = userInput.split(" ");
        
        // loop through the user entered numbers and set anything we are unsure about to 0 and notify the user
        for (int i = 0; i < inputArray.length; i++)
        {
            int singleValue = 0;            

            try
            {
                singleValue = Integer.parseInt(inputArray[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("incorrect variable entered in element " + i + " this value is defaulting to zero");
                singleValue = 0;
            }
            totalSum += singleValue;
        }
        // print out the sum once all the variables are held in totalSum
        System.out.println("The sum is: " + totalSum);
    }
}
