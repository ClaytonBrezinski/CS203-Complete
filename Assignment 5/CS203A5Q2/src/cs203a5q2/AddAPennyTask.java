/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q2;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class AddAPennyTask implements Runnable
{
    Account account;

    AddAPennyTask(Account a)
    {
        account = a;
    }

    @Override
    public void run()
    {
        account.deposit(1);
        Thread.yield();
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
