/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q1;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class Product
{
    private String name;
    private int ID;
    private String description;

    /*
     Purpose: reurns the name of the product
     Arguments: n/a
     Outputs: String - name of product
     Notes:
     */
    public String getName()
    {
        return this.name;
    }

    /*
     Purpose: returns the id of the product
     Arguments: n/a
     Outputs: int - id of the product
     Notes:
     */
    public int getID()
    {
        return this.ID;
    }

    /*
     Purpose: returns the description of the product
     Arguments: n/a
     Outputs: String - description of the product
     Notes:
     */
    public String getDescription()
    {
        return description;
    }

    /*
     Purpose: Set's the name of the product to the given value
     Arguments: String - name we want the product to be
     Outputs: n/a
     Notes:
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /*
     Purpose: Sets the id of the product to the given value
     Arguments: int - id we want the product to be
     Outputs: n/a
     Notes:
     */
    public void setID(int ID)
    {
        this.ID = ID;
    }

    /*
     Purpose: Sets the description of the product to the given value
     Arguments: String - descrioption we want the product to have
     Outputs: n/a
     Notes:
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
