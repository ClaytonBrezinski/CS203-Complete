/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package cs203a5q1;

import java.util.ArrayList;
import java.util.Scanner;

/**

 @author Dolan
 */
public class ProductDB
{

    ArrayList<Product> database;

    /*
     Purpose: creates the product database, initializes the Scanner, and then opens the main menu
     Arguments: N/A
     Outputs: N/A
     Notes:
     */
    public ProductDB()
    {
        database = new ArrayList<Product>();
        Scanner userInput = new Scanner(System.in);
        mainMenu(userInput);
    }

    /*
     Purpose: displays to the user the different functions of the product database
     Arguments: Scanner - the method that the user is using to interact with the product database
     Outputs: print to commandline
     Notes: this function will allow the user to either: quit, list all products, search by keyword to either display or remove products within the db
     */
    public void mainMenu(Scanner input)
    {
        while (true)
        {
            System.out.println("0) Quit");
            System.out.println("1) Add new product");
            System.out.println("2) List all products");
            System.out.println("3) Search product by keyword and display");
            System.out.println("4) Search product by keyword and remove");
            System.out.println("Please choose from the above menu by entering a number: ");
            if (input.hasNextInt() == true)
            {
                int userSelection = input.nextInt();
                input.nextLine();
                System.out.println();
                String keyword;
                switch (userSelection)
                {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addProduct(input);
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    System.out.println("Enter search keyword: ");
                    keyword = input.nextLine();
                    searchAndDisplay(keyword);
                    break;
                case 4:
                    System.out.println("Enter search keyword: ");
                    keyword = input.nextLine();
                    searchAndRemove(keyword, input);
                    break;
                default:
                    break;
                }
            }
            else
            {
                System.out.println("invalid entry");
                input.next();
            }
        }
    }

    /*
     Purpose: creates a new product from user input and then adds it to the database
     Arguments: Scanner - method to extract information for creation of the product
     Outputs: N/A, new product created and added to DB
     Notes:
     */
    public void addProduct(Scanner input)
    {
        // get product
        System.out.println("Enter product name: ");
        String name = input.nextLine();
        int id = 0;
        while (true)
        {
            System.out.println("Enter product ID: ");

            if (input.hasNextInt() == true)
            {
                id = input.nextInt();
                input.nextLine();
                break;
            }
            else
            {
                System.out.println("invalid entry");
                input.nextLine();
            }
        }
        System.out.println("Enter product description: ");
        String description = input.nextLine();
        System.out.println();

        //create new product from inputs
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setID(id);
        newProduct.setDescription(description);

        // add product to the database
        database.add(newProduct);
    }

    /*
     Purpose: lists all products within the database
     Arguments: N/A
     Outputs: print to the command line of all the products
     Notes:
     */
    public void listProducts()
    {
        for (int i = 0; i < database.size(); i++)
        {
            System.out.println(database.get(i).getName() + ", " + database.get(i).getID() + ", " + database.get(i).getDescription());
        }
        System.out.println();
    }

    /*
     Purpose: from the keyword, gets an ArrayList from the database of all the products that match it, then displays it to the user.
     Arguments: String - the keyword that we are going to seach for
     Outputs: N/A, printout to the command line of all similar products
     Notes:
     */
    public void searchAndDisplay(String keyword)
    {
        ArrayList<Product> searchList = search(keyword);
        if (searchList.size() == 0)
        {
            System.out.println("nothing found" + '\n');
        }
        else
        {
            for (int i = 0; i < searchList.size(); i++)
            {
                System.out.println(searchList.get(i).getName() + ", " + searchList.get(i).getID() + ", " + searchList.get(i).getDescription());
            }
        }
    }

    /*
     Purpose: from the keyword, gets an ArrayList from the database of all the products that match it, then displays it to the user with a prompt to keep or
     remove the product
     Arguments: String - the keyword to search for, Scanner - the method in which we are getting user input.
     Outputs: N/A - print to the command line
     Notes:
     */
    public void searchAndRemove(String keyword, Scanner input)
    {
        ArrayList<Product> searchList = search(keyword);
        if (searchList.size() == 0)
        {
            System.out.println("nothing found" + '\n');
        }
        else
        {
            for (int i = 0; i < searchList.size(); i++)
            {
                System.out.println("Delete: " + searchList.get(i).getName() + ", " + searchList.get(i).getID() + ", " + searchList.get(i).getDescription() + (" (Y/N?)"));
                while (true)
                {
                    String userChoice = input.next();
                    if (userChoice.equalsIgnoreCase("Y") == true)
                    {
                        database.remove(searchList.get(i));
                        break;
                    }
                    else if (userChoice.equalsIgnoreCase("N") == true)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("invalid entry");
                    }
                }
            }
        }
    }

    /*
     Purpose: Search the databse for any product that has matching values to the keyword
     Arguments: String - the keyword we will be searching for
     Outputs: ArrayList of products.
     Notes:
     */
    private ArrayList<Product> search(String keyword)
    {
        ArrayList<Product> returnList = new ArrayList<Product>();
        for (int i = 0; i < database.size(); i++)
        {
            if (String.valueOf(database.get(i).getName()).contains(keyword) == true)
            {
                returnList.add(database.get(i));
            }
            else if (String.valueOf(database.get(i).getID()).contains(keyword) == true)
            {
                returnList.add(database.get(i));
            }
            else if (String.valueOf(database.get(i).getDescription()).contains(keyword) == true)
            {
                returnList.add(database.get(i));
            }
        }
        return returnList;
    }
}
