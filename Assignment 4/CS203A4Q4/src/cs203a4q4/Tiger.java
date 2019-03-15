package cs203a4q4;

public class Tiger extends Animal
{
    @Override
    public String sound()
    {
        return "Tiger: RROOAARR";
    }

    /*
     Purpose: allow the tiger to be cloneable and return a chicken object
     Arguments:
     Outputs: Tiger
     Notes:
     */
    @Override
    public Tiger clone() throws CloneNotSupportedException
    {
        return (Tiger) super.clone();
    }
}
