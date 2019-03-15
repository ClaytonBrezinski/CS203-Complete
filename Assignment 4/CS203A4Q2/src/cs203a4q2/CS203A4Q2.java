/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes: Opens a data stream and places 10 random integers into it, closes the stream, then opens the file and reads the 10 random integers
 */
package cs203a4q2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CS203A4Q2
{
    /*
    Purpose: Opens a data stream and places 10 random integers into it, closes the stream, then opens the file and reads the 10 random integers
    Arguments: N/A
    Outputs: Command line printout of the 10 random integers
    Notes:
    */
    public static void main(String[] args)
    {
        try
        {
            // Open dataStream using FileOutput stream and create random number generator
            DataOutputStream outData = new DataOutputStream(new FileOutputStream("RandomInt.dat"));
            Random rand = new Random();
            
            // write random integers between 1 and 10
            for (int i = 0; i < 10; i++)
            {
                outData.writeInt(rand.nextInt(10));
            }
            // close the output stream and open the input stream to begin reading
            outData.close();
            DataInputStream inData = new DataInputStream(new FileInputStream("RandomInt.dat"));
            
            //iterate through the input stream until it hits EOF
            System.out.println("The output of the file is:");
            while (inData.available() != 0)
            {
                System.out.println(inData.readInt());
            }
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
