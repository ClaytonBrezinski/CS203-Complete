/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package cs203a4q5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**

 @author Dolan
 */
public class CreateItemRecord
{
    public CreateItemRecord()
    {
        try
        {
            RandomAccessFile raf = new RandomAccessFile("records", "rw");

            raf.setLength(0);
            // put in 10 blank values
            for (int i = 0; i < 10; i++)
            {
                raf.writeDouble(0);
            }

            // user selects which location they want to write to.
            // have a check to make sure that the user can only select between 1 and 10. 
            Scanner input = new Scanner(System.in);
            boolean completed = false;
            while (completed == false)
            {
                System.out.println("enter -999 to exit the program");
                System.out.println("Enter the itemNumber that you want to alter");
                int userSelection = input.nextInt();
                if (userSelection == -999)
                {
                    completed = true;
                    break;
                }
                else if (userSelection > 0 && userSelection < 11)
                {
                    raf.seek((userSelection - 1) * 8); // Move the file pointer to the before user selected itemNumber
                    System.out.println("Enter the price that you want to alter");
                    double userPrice = input.nextDouble();
                    raf.writeDouble(userPrice);
                }
                else
                {
                    System.out.println("Invalid entry, try again");
                }
            }
            //raf.seek((1 - 1) * 8);
            //System.out.println("The number in itemNumber: " + 1 + " is: " + raf.readDouble());

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
