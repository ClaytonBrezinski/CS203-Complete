/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q5;

/*
 Purpose:
 Notes
 */
public final class MyString2
{
    private String string;

    public MyString2(String s)
    {
        this.string = s;
    }

    public int compare(String s)
    {
        return this.string.compareToIgnoreCase(s);
    }

    public MyString2 subString(int begin)
    {
        this.string.substring(begin);
        return this;
    }

    public MyString2 toUpperCase()
    {
        this.string.toUpperCase();
        return this;
    }

    public char[] toChars()
    {
        return this.string.toCharArray();
    }

    /*
     public static MyString2 valueOf(boolean b)
     {
     this.string = String.valueOf(b);
     }
     */
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
