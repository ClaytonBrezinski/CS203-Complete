/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package cs203a4q5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**

 @author Dolan
 */
public class DisplayRecordSequentially
{

    /**
     @param args the command line arguments
     */
    public DisplayRecordSequentially()
    {
        try
        {
            RandomAccessFile raf = new RandomAccessFile("records", "rw");
            // print out the 10 values we have placed into the RAF
            for (int i = 1; i <= raf.length() / 8; i++)
            {
                raf.seek((i - 1) * 8);
                System.out.println("the number in itemNumber is: " + i + " The price is: " + raf.readDouble());

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
