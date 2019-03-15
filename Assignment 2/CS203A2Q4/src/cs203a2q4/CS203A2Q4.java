/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q4;

/*
 Purpose: To create a string that will be split up by a given delimmiter. From there, give the string to a splitting function and then print the result of said
 function
 Notes:
 */
public class CS203A2Q4
{
    public static void main(String[] args)
    {
        // test 1
        String preSplitString = "ab#12$453";
        System.out.println("Initial String = " + preSplitString + " and the regex: #");
        String[] postSplitString = split(preSplitString, "#");
        // print the string 
        for (int i = 0; i < postSplitString.length; i++)
        {
            if (postSplitString[i] != null)
            {
                System.out.print(postSplitString[i] + ", ");
            }
        }
        System.out.println();
        postSplitString = null; // result the string for another use

        // test 2
        preSplitString = "a?b?gf#e";
        System.out.println("Initial String = " + preSplitString + " and the regex: #");
        postSplitString = split(preSplitString, "?#");
        // print the string 
        for (int i = 0; i < postSplitString.length; i++)
        {
            if (postSplitString[i] != null)
            {
                System.out.print(postSplitString[i] + ", ");
            }
        }
        System.out.println();
    }

    /*
     Purpose: Takes the given string and regex and procedurally splits the string into a string array
     Arguments: String - the string we want to break down into array form, String - what we want to use in order to break down the string
     Outputs: String[] - the string broken down into array format
     Notes:
     */
    public static String[] split(String s, String regex)
    {
        String[] returnStringArray = new String[s.length()];
        //declare the returning variable result.

        //make a string copy so you do not modify the original string s.
        String tempString = s;
        int tempPosition = 0;
        while (tempString != "")
        {
            for (int i = 0; i < regex.length(); i++)
            {
                char potentialAddCharacter = regex.charAt(i);
                int index = tempString.indexOf(potentialAddCharacter);

                if (index == -1)
                {
                    if (i == regex.length() - 1)
                    {
                        returnStringArray[tempPosition] = tempString.substring(0, tempString.length());
                        tempString = "";
                    }
                    continue;
                }

                returnStringArray[tempPosition] = tempString.substring(0, index);
                returnStringArray[tempPosition++] = potentialAddCharacter + "";
                tempString = tempString.substring(index + 1, tempString.length());
                break;
            }
            tempPosition++;
        }
        return returnStringArray;
    }
}
