/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a4q5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
 Purpose:
 Notes
 */
public class AccessRecordRandomly
{
    public AccessRecordRandomly()
    {
        Scanner input = new Scanner(System.in);
        try
        {
            RandomAccessFile raf = new RandomAccessFile("records", "rw");
            boolean completed = false;
            while (completed == false)
            {
                System.out.println("Enter -999 to exit the program");
                System.out.println("Enter the itemNumber you want to view the price of: ");
                int userSelection = input.nextInt();
                if (userSelection == -999)
                {
                    completed = false;
                    break;
                }
                else if (userSelection > 0 && userSelection < 11)
                {
                    raf.seek((userSelection - 1) * 8);
                    System.out.println("The value at : " + userSelection + " is: " + raf.readDouble() + '\n');
                }
                else
                {
                    System.out.println("That is an invalid input, please try another");
                }
            }
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

/*
 Purpose:
 Arguments:
 Outputs:
 Notes:
 */
