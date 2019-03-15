/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q3;

/**

 @author Dolan
 */
public class CS203A2Q3
{

    /*
    Purpose: creates an assortment of ships and tests the toString methods that we had to override. 
    */
    public static void main(String[] args)
    {
	Ship[] a = new Ship[3];
        a[1] = new CruiseShip("CruiseShipNumber2", "1992" , 100);
        a[2] = new CargoShip("CargoShipNumber3", "1700", 200);
        a[0] = new Ship("RegularShip1", "2014");
        for (int i = 0; i< a.length; i++)
        {
            System.out.println(a[i].toString());
        }
    }
    
}
