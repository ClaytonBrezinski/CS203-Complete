/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a4q3;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class Rectangle implements Drawable
{
    protected int height;
    protected int width;

    // default constructor
    Rectangle()
    {
        this.height = 2;
        this.width = 1;
    }
    // constructor
    Rectangle(int inHeight, int inWidth)
    {
        this.height = inHeight;
        this.width = inWidth;
    }
    /*
    Purpose:    returns width
    Arguments:
    Outputs: int - width of the rectangle
    Notes:
    */
    public int getWidth()
    {
        return this.width;
    }
    /*
    Purpose:    returns height
    Arguments:
    Outputs: int - height of the rectangle
    Notes:
    */
    public int getHeight()
    {
        return this.height;
    }
    /*
    Purpose: draws the rectangle to the command line
    Arguments:
    Outputs: a drawing of the rectangle on the command line in *'s
    Notes:
    */
    @Override
    
    public void draw()
    {
        for (int i = 0; i < this.height; i++)
        {
            for (int j = 0; j < this.width; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

}

/*
 Purpose:
 Arguments:
 Outputs:
 Notes:
 */
