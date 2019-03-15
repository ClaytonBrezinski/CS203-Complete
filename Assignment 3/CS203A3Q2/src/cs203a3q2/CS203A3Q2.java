/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a3q2;


import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Stack;
/**

 @author Dolan
 */
public class CS203A3Q2
{

    /**
    This program looks at the webpage that the assignment specified. Checked that the URL exits. Then it begins to scrape the webpage. If there is content 
    to be scraped, it splits each of the words into an array, and then through the use of a stack, it counts the number of words counted. 
     */
    public static void main(String[] args)
    {
        URL url = null;
        // make an attempt at opening the url. If not, throw an error
        try
        {
            url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
        }
        catch (MalformedURLException e)
        {
            System.out.println("URL was not found: " + e.toString() + e.getMessage());
            System.exit(0);
        }
        // begin the scraping of the webpage by opening a Scanner for the URL followed by saving all the information into a long string. 
        String webpageData = "";
        try 
        {
            Scanner webInput = new Scanner(url.openStream());
            while (webInput.hasNext())
            {
                webpageData += webInput.nextLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("There was an error pulling data from your webpage: " + e);
        }
        // if we have a input from the web, put it into an array so that each word is placed within it.
        // but since .split is not perfect, use a stack to get only the words and not the "". 
        if (webpageData != "")
        {
            String[] wordArray = webpageData.split("[,. ]");
            Stack stack = new Stack();
            for (int i = 0; i < wordArray.length; i++)
            {
                if (wordArray[i].equalsIgnoreCase("") == false)
                {
                   stack.push(wordArray[i]);
                }
            }
            System.out.println("The total amount of words counted was: " + stack.size());
        }
        else 
        {
            System.out.println("Nothing was scraped off of the website you specified");
        }
        
    }

}
