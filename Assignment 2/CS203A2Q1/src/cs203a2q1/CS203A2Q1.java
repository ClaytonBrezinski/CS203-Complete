/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q1;

/*
 Purpose: to create and account, set the annual interest rate, withdraw from it, make a deposit larger than the withdrawl, and then print the balance,
 monthly interest and the date the account was created.
 Notes
 */
public class CS203A2Q1
{

    public static void main(String[] args)
    {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("Balance: " + a.getBalance() + " monthly interest: " + a.getMonthlyInterest() + " date created: " + a.getDateCreated());
    }
}
