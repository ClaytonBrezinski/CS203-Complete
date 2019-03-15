/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q3;

/*
 Purpose: To inherit attributes from the Ship class and present its own
 Notes
 */
public class CargoShip extends Ship
{
    protected int cargoCapacity = 0;

    /*
     Purpose: defualt constructor
     Arguments:n/a
     Outputs: n/a
     Notes:
     */
    public CargoShip()
    {

    }

    /*
     Purpose: specialized constructor
     Arguments: String - name of the ship, String - the build year, int - the cargo capacity
     Outputs: n/a
     Notes:
     */
    public CargoShip(String inName, String inBuildYear, int inCargoCapacity)
    {
        this.name = inName;
        this.buildYear = inBuildYear;
        this.cargoCapacity = inCargoCapacity;
    }

    /*
     Purpose: Override of the toString method
     Arguments:n/a
     Outputs: String
     Notes:
     */
    @Override
    public String toString()
    {
        return this.name + " " + this.cargoCapacity;
    }

}
