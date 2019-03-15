/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q3;

/*
 Purpose: to inherit attributes from the ship class and have attributes of its own that it works with
 Notes
 */
public class CruiseShip extends Ship
{
    protected int MAX_PASSENGERS = 0;

    /*
     Purpose: Default constructor
     Arguments:
     Outputs:
     Notes:
     */
    CruiseShip()
    {

    }

    /*
     Purpose: specailized constructor
     Arguments: String - name, String - buildYear, int - the max number of passengers
     Outputs: n/a
     Notes:
     */
    CruiseShip(String inName, String inBuildYear, int inMaxPassengers)
    {
        this.name = inName;
        this.buildYear = inBuildYear;
        this.MAX_PASSENGERS = inMaxPassengers;
    }

    /*
     Purpose: override of the toString method
     Arguments:
     Outputs: String - the name and the number of passengers
     Notes:
     */
    @Override
    public String toString()
    {
        return this.name + " " + this.MAX_PASSENGERS;
    }
}
