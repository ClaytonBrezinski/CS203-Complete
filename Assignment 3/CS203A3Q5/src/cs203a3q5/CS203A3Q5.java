/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a3q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/*
This program takes in a file path from the command line, checks if the text file exists, and then alters the name of the .txt file by adding the date and 
the time to the end of it
*/
public class CS203A3Q5
{
    public  void main(String[] args)
    {
        // check if there is only 1 input, otherwise exit
        String filename = "";
        if (args.length == 1)
        {
            filename = args[1];
        }
        else
        {
            System.out.println("Too many arguements, please only enter the name of the file");
            System.exit(0);
        }
        // if the inputs are right and create the File, check if the file exis, and then rename it
        File file = new File(filename);
        if (file.isFile() == true || file.exists() == true)
        {
            Date date = new Date();
            filename = filename + date.toString().replaceAll("_", ":");
            file = new File(filename);
            file.renameTo(file);
            System.out.println("Old file name: " + filename);
        }
        else
        {
            System.out.println("The file does not exist");
        }
    }
}
