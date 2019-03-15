/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q2;


public class AccountWithoutSync
{
    private static Account account = new Account();

    /*
    Purpose: creates a new account and then prints the inital balance. Following this, it creates 100 instances of AddAPennyTask - which has a 2mS delay on it
    Arguments: N/A
    Outputs: command line
    Notes:
    */
    public static void main(String[] args)
    {
        Account account = new Account();

        System.out.println("Account Balance Before Deposit is: " + account.getBalance());
        for (int i = 0; i < 100; i++)
        {
            new Thread(new AddAPennyTask(account)).start();
        }
  
        System.out.println("Account Balance After Deposit is: " + account.getBalance());
        
    }
}
