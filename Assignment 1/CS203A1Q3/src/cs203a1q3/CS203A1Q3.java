/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Date of completion: 30/09/2016
 Notes:
 */

package cs203a1q3;

/*
 Purpose: Prints out the requested code
 Notes:
 */
public class CS203A1Q3
{
    public static void main(String[] args)
    {
        
        System.out.printf("amount is %f %e\n", 32.32, 32.32);  // this prints a float version of the 32.32 followed by an exponential versio of 32.32
        System.out.println("error on line 2");  
        //System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);    // this does ot compile correctly so it is commented out, there are too many %'s
        System.out.printf("%6b\n", (1 > 2));    // this prints out a 6bit right justified boolean for 1>2
        System.out.printf("%6s\n", "Java");     // this prints out a 6bit right justtified string "Java"
        System.out.printf("%-6b%s\n", (1 > 2), "Java"); // this prints out a 6bit left justified boolean immediately followed by a string "Java" and then a 
                                                        // newline character
        
    }
    
}

 
