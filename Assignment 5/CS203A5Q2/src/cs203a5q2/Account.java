/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q2;

 /*
 Purpose: Holds an integer for balance and allows users to get the balance and deposit to the balance
 Notes
 */
public class Account
{
    private int balance = 0;
    
    /*
    Purpose: Returns the balance
    Arguments: N/A
    Outputs: int - the balance of the current account
    Notes:
    */
    public int getBalance()
    {
        return balance;
    }
    
    /*
    Purpose: Adds the given amount to the balance of the Account
    Arguments: int - the amount we want to add to the balance
    Outputs: n/a, deposit is incremented
    Notes:
    */
    public synchronized void deposit(int amount)
    {
        if(amount < 1)
        {
            System.out.println("That is an invalid deposit amount");
        }
        int newBalance = balance + amount;
        
        // This delay is deliberately added to magnify the
        // data-corruption problem and make it easy to see.
        try
        {
            Thread.sleep(2);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        this.balance = newBalance;
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
