/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */
package cs203a1q7;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;



/*
Purpose: recieves a set of the gross sales from each employee and will calulate the salary range of each employeee and return a chart of how many employees are 
         in each salary band
Notes:  when negative number is entered, it will print out the desired results
*/
public class CS203A1Q7
{

    /*
    Purpose: request the user to enter the salaries, it will then classify each of the salaries into the stated salary ranges between 200 and 1000, then it will
             print all the salaries in the desired format
    Arguements: N/A
    Outputs: String - a pretty printout of all the salaries
    Notes:
    */
    public static void main(String[] args)
    {
        double[] salariesList = getSalaries();
        int[] salaryCount = classifySalaries(salariesList);
        printPrettySalaries(salaryCount);
    }
    
    /*
    Purpose: Requests the all the salaries, checks for any bad inputs, and adds a basic pay to the salary total, and stops when a negative value is entered
    Arguements: N/A
    Outputs: Double[] - an array of all the entered salaries
    Notes:
    */
    private static double[] getSalaries()
    {
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        double[] inputArray = new double[1];
        double userInput = 0;
        while (finished == false)
        {
            boolean useNumber = true;
            System.out.println("Enter gross sales or enter a negative value to terminate the program: ");
            try 
            {
                userInput = input.nextDouble();
            }
            catch (InputMismatchException e)
            {
                useNumber = false;
                System.out.println("this input was not accepted") ;
                input.next();// Move to next other wise exception
            }
            if (useNumber == true)
            {
               if (userInput < 0)
               {
                   finished = true;
               }
               else
               {
                // add the 8% of gross sales and the basic income
                inputArray[inputArray.length - 1] = userInput*0.08 + 200;
                inputArray = Arrays.copyOf(inputArray, inputArray.length + 1); 
               }
            }
                
        }  
        return inputArray;
    }
    
    /*
    Purpose: classifies the given salaries into their defined salary ranges
    Arguements: double[] - an array of all the salaries the user inputted
    Outputs: int[] - an array containing how many salaries landed in between each salary band
    Notes:
    */
    private static int[] classifySalaries(double[] inSalaries)
    {
        int salaryRangeCount[] = {0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < inSalaries.length; i++)
        {
            if (inSalaries[i] > 200 && inSalaries[i] < 299)
            {
                salaryRangeCount[0] += 1;
            }
            else if (inSalaries[i] > 300 && inSalaries[i] < 399)
            {
                salaryRangeCount[1] += 1;
            }
            else if (inSalaries[i] > 400 && inSalaries[i] < 499)
            {
                salaryRangeCount[2] += 1;
            }
            else if (inSalaries[i] > 500 && inSalaries[i] < 599)
            {
                salaryRangeCount[3] += 1;
            }
            else if (inSalaries[i] > 600 && inSalaries[i] < 699)
            {
                salaryRangeCount[4] += 1;
            }
            else if (inSalaries[i] > 700 && inSalaries[i] < 799)
            {
                salaryRangeCount[5] += 1;
            }
            else if (inSalaries[i] > 800 && inSalaries[i] < 899)
            {
                salaryRangeCount[6] += 1;
            }
            else if (inSalaries[i] > 900 && inSalaries[i] < 999)
            {
                salaryRangeCount[7] += 1;
            }
            else if (inSalaries[i] > 1000 )
            {
                salaryRangeCount[8] += 1;
            }
            else
            {
                // error
            }
        }
        return salaryRangeCount;
    }
    
    /*
    Purpose: prints the salaries in a format such that they appear to be held in columns with headers at the top
    Arguements: int[] - an array of the number of employees in each salary band
    Outputs: String - a pretty formatted output of each employee in salary. 
    Notes:
    */
    private static void printPrettySalaries(int[] salariesCount)
    {
        String[] salaryDivision = {"$200 - $299", "$300 - $399","$400 - $499","$500 - $599","$600 - $699","$700 - $799","$800 - $899","$900 - $999","$1000 and over"};
        // need to take the salariesCounts , print the salarayDivision and then the salary with an indent beside it.  
        System.out.printf("%-10s\t\t", "IncomeRange");
        System.out.printf("%s\n", "Number");      
        for (int i = 0; i < salaryDivision.length; i++)
        {
            System.out.printf("%-10s\t\t", salaryDivision[i]);
            System.out.printf("%s\n", salariesCount[i]);
        } 
    }
}
