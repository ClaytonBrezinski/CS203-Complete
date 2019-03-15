/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q2;

import java.io.IOException;
import java.util.Scanner;

/*
 Purpose: To contain multiple accounts on an ATM and allows the user to interact with them
 Notes:
 */
public class ATM
{
    int MAX_ACCOUNTS = 10;
    private Account[] accountArray = new Account[MAX_ACCOUNTS];

    /*
     Purpose: default constructor for an atm
     Arguments: n/a
     Outputs:n/a
     Notes:
     */
    public ATM()
    {
        for (int i = 0; i < this.MAX_ACCOUNTS; i++)
        {
            this.accountArray[i] = new Account();
            this.accountArray[i].setID(i);
        }
        selectID();
    }

    /*
     Purpose: create 10 accounts within an atm with the specified intial deposit
     Arguments: double - the amount we want deposited in each account
     Outputs: n/a
     Notes:
     */
    public ATM(double inInitialDeposit)
    {
        for (int i = 0; i < this.MAX_ACCOUNTS; i++)
        {
            this.accountArray[i] = new Account();
            this.accountArray[i].setID(i);
            this.accountArray[i].setBalance(inInitialDeposit);
        }
        selectID();
    }

    /*
     Purpose: function that will select the Id that the user wants to work under
     Arguments:n/a
     Outputs:n/a
     Notes:
     */
    private void selectID()
    {
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        System.out.println("Please enter a negative number to exit");
        while (finished == false)
        {
            System.out.println("Enter an ID: ");
            //QQ may need a try and catch here
            int userInput = input.nextInt();
            if (userInput < 0)
            {
                return;
            }
            else
            {
                int accountID = userInput;
                System.out.println();
                this.workWithUserInput(accountID);
            }
        }
    }

    /*
     Purpose: displays the main menu for the user
     Arguments:n/a
     Outputs:print out
     Notes:
     */
    private void displayMainMenu()
    {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.print("4: exit");
        System.out.print("{Please enter a choice: ");
    }

    /*
     Purpose: through the use of a scanner this accepts user input and allows them to traverse the atm
     Arguments:user input
     Outputs:printout
     Notes:
     */
    private void workWithUserInput(int accountID)
    {
        Scanner input = new Scanner(System.in);
        //QQ will need to see if try and catch will need to be used here

        boolean finished = false;
        while (finished == false)
        {
            this.displayMainMenu();
            int userInput = input.nextInt();
            switch (userInput)
            {
            case 1: // CheckBalance
            {
                System.out.println("The balance is: $" + accountArray[accountID].getBalance());
                break;
            }
            case 2: // withdraw
            {
                System.out.println("Enter an amount to withdraw: $");
                double withDrawlAmount = input.nextDouble();
                accountArray[accountID].withdraw(withDrawlAmount);
                break;
            }
            case 3: // deposit
            {
                System.out.println("Enter an amount to deposit: $");
                double depositAmount = input.nextDouble();
                accountArray[accountID].deposit(depositAmount);
                break;
            }
            case 4:
            {
                finished = true;
                break;
            }
            default:
            {
                System.out.println("Please select a valid input");
            }
            }
            System.out.println();
        }
        return;
    }
}
