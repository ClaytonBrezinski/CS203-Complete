/*
 Author: Clayton brezinski
 Student id: 200220989
 Class: CS203 A2
 */
package cs203a2q3;

/*
 Purpose: To contain attributes that other ships will inherit
 Notes
 */
public class Ship
{
    protected String name = "";
    protected String buildYear = "";

    /*
     Purpose: Default constructor
     Arguments:
     Outputs:
     Notes:
     */
    public Ship()
    {

    }

    /*
     Purpose: specialized constructor
     Arguments: String - name, String - the build year
     Outputs: n/a
     Notes:
     */
    public Ship(String inName, String inBuildYear)
    {
        this.name = inName;
        this.buildYear = inBuildYear;
    }

    /*
     Purpose: sets the name to the given input
     Arguments: String - the desired name
     Outputs: n/a
     Notes:
     */
    public void setName(String inName)
    {
        this.name = inName;
    }

    /*
     Purpose: Sets the ship to the given year
     Arguments: String - the desired year
     Outputs: n/a
     Notes:
     */
    public void setBuildYear(String inBuildYear)
    {
        this.buildYear = inBuildYear;
    }

    /*
     Purpose: Gets the name of the ship
     Arguments:n/a
     Outputs: String - the name of the ship
     Notes:
     */
    public String getName()
    {
        return this.name;
    }

    /*
     Purpose: gets the build year of the ship
     Arguments: n/a
     Outputs: String - the build year of the ship
     Notes:
     */
    public String getBuildYear()
    {
        return this.buildYear;
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
        return name + " " + buildYear;
    }
}
