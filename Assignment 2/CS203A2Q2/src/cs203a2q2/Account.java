/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q2;

import java.util.Date;

/*
 Purpose: To contain important user information such as their is, balance, annual interest rate, and the date their account was created
 Notes
 */
public class Account
{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;	//assume all accounts have the same interest rate
    private Date dateCreated;

    /*
     Purpose: Default constructor
     Arguments: N/A
     Outputs: default account
     Notes:
     */
    public Account()
    {
        this.dateCreated = new Date();
    }

    /*
     Purpose: create a non default account
     Arguments: Int - the Id for the account, double - the starting balance that we want to give the account
     Outputs: a non default account
     Notes:
     */
    public Account(int inID, double inBalance)
    {
        // make suer ID is positive number
        this.id = inID;
        this.balance = inBalance;
        this.dateCreated = new Date();
    }

    /*
     Purpose: returns the id of the current object
     Arguments: N/A
     Outputs: int - the ID
     Notes:
     */
    public int getID()
    {
        return this.id;
    }

    /*
     Purpose: returns the balance of the object
     Arguments: N/A
     Outputs: double - the current balance
     Notes:
     */
    public double getBalance()
    {
        return this.balance;
    }

    /*
     Purpose: returns the annual interest rate of the object
     Arguments: N/A
     Outputs: double - the annual interest rate
     Notes:
     */
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    /*
     Purpose: returns the date the object was created at
     Arguments: N/A
     Outputs: Date object
     Notes:
     */
    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    /*
     Purpose: set the ID based on the user input
     Arguments: int - the desired ID
     Outputs: N/A
     Notes:
     */
    public void setID(int inID)
    {
        if (inID < 0)
        {
            System.out.println("All ID's must be positive integers");
        }
        this.id = inID;
    }

    /*
     Purpose: Set the current balance to what the user specified
     Arguments: doublre - desired Balance
     Outputs: N/A
     Notes:
     */
    public void setBalance(double inBalance)
    {
        if (inBalance < 0)
        {
            System.out.println("That is an insufficient balance");
            return;
        }
        this.balance = inBalance;
    }

    /*
     Purpose: sets the annual interest rate based off of user input
     Arguments: double - the desired annual interest rate
     Outputs: n/a
     Notes:
     */
    public void setAnnualInterestRate(double inAnnualInterestRate)
    {
        if (inAnnualInterestRate < 0)
        {
            System.out.println("All interestRates must be positive integers");
        }
        this.annualInterestRate = inAnnualInterestRate;
    }

    /*
     Purpose: get the monthly interest
     Arguments: n/a
     Outputs: double - the monthly interest for the object
     Notes:
     */
    public double getMonthlyInterestRate()
    {
        return (this.annualInterestRate / 12);
    }

    /*
     Purpose: return the monthly interest that is paid
     Arguments: n/a
     Outputs: double - the monthly interest
     Notes:
     */
    public double getMonthlyInterest()
    {
        return this.balance * this.getMonthlyInterestRate();
    }

    /*
     Purpose: alllows the user to witdrawl the specified amount
     Arguments: double - the amount we want to withdraw
     Outputs: double - the amount that we have withdrew
     Notes:
     */
    public double withdraw(double inWithdrawlAmount)
    {
        // check for negative withdrawlAmount
        // check for withdrawlAmount larger than current balance
        if (inWithdrawlAmount < 0)
        {
            System.out.println("That is an invalid withdrawl amount");
            return 0;
        }
        else if ((this.getBalance() - inWithdrawlAmount) < 0)
        {
            System.out.println("You have insufficient funds to withdrawl that amount");
            return 0;
        }
        else
        {
            double moneyBack = inWithdrawlAmount;
            this.balance -= inWithdrawlAmount;
            this.printBalance();
            return moneyBack;
        }
    }

    /*
     Purpose: allows the user to deposit the amount specified
     Arguments:double - the amount to be deposited
     Outputs: n/a
     Notes:
     */
    public void deposit(double inDepositAmount)
    {
        if (inDepositAmount < 0)
        {
            System.out.println("You deposit cannot be negative");
            return;
        }
        // check for negative inDepositAmount
        this.balance += inDepositAmount;
    }

    /*
     Purpose: Prints the current balance of the account
     Arguments: n/a
     Outputs: printout
     Notes:
     */
    private void printBalance()
    {
        System.out.println("Your current balance is: $" + this.getBalance());
    }
}
