/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
import java.util.Scanner;
import java.lang.NumberFormatException;

public class main
{
    /*
     Purpose: Reuests the user to input a 3x3 matrix, which it then checks for any non numbers and then enters it into a 3x3 matrix. Following this, the matrix
     is sorted by its columns and printed in the form that we understand
     Arguements: None
     Outputs: A 2D array printed in a familiar format
     Notes: if the user enters more than 3 values for a row, those values will be ignored. 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  // Reading from System.in
        double[][] twoDArray = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row by having a space inbetween numbers: ");
        // prompt the user to input the array
        for (int i = 0; i < 3; i++)
        {
            String userString = input.nextLine();
            String[] individualNumbers = userString.split(" ");
            double inputForArray = 0.0;
            for (int j = 0; j < 3; j++)
            {
                try
                {
                    inputForArray = Double.parseDouble(individualNumbers[j]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Due to an incorrect input, we are setting that incorrect value to 1.0");
                    inputForArray = 1.0;
                }
                twoDArray[i][j] = inputForArray;
            }
        }

        //output a request for another string if there is an error with the typecasting
        twoDArray = sortColumns(twoDArray);

        // print out the array in a pretty for
        System.out.println("The column-sorted array is:");
        print(twoDArray);
    }

    /*
     Purpose: Sorts the given 2D array by its columns and returns the sorted matrix
     Arguements: double 2D array
     Outputs: double 2D array
     Notes:
     */
    public static double[][] sortColumns(double[][] inMatrix)
    {
        for (int i = 0; i < inMatrix.length; i++)
        {
            double[] column =
            {
                inMatrix[0][i], inMatrix[1][i], inMatrix[2][i]
            };
            column = sort3LengthArray(column);
            inMatrix[0][i] = column[0];
            inMatrix[1][i] = column[1];
            inMatrix[2][i] = column[2];
        }
        return inMatrix;
    }

    /*
     Purpose: Sorts the given 3 length array using a juvenile method
     Arguements: double Array - 3 length
     Outputs: double Array - 3 length
     Notes: If it was requested that we make a flexible program, I would have accepted any size array and use bubble sort in order to acomplish this task
     */
    public static double[] sort3LengthArray(double[] inColumn)
    {
        double temp = 0.0;
        if (inColumn[0] > inColumn[1])
        {
            temp = inColumn[0];
            inColumn[0] = inColumn[1];
            inColumn[1] = temp;
        }
        if (inColumn[1] > inColumn[2])
        {
            temp = inColumn[1];
            inColumn[1] = inColumn[2];
            inColumn[2] = temp;
        }
        if (inColumn[0] > inColumn[1])
        {
            temp = inColumn[0];
            inColumn[0] = inColumn[1];
            inColumn[1] = temp;
        }
        return inColumn;
    }

    /*
     Purpose: print the matrix in the form that we imagine it to be
     Arguements:none
     Outputs:a printout to the command line of the matrix
     */
    public static void print(double[][] inMatrix)
    {
        for (int i = 0; i < inMatrix.length; i++)
        {
            String outputString = "";
            for (int j = 0; j < inMatrix.length; j++)
            {
                outputString += inMatrix[i][j] + " ";
            }
            System.out.println(outputString);

        }
    }
}
/*
 Purpose:
 Arguements:
 Outputs:
 Notes:
 */
