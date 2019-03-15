package cs203a4q4;

public class Chicken extends Animal
{
    @Override
    public String sound()
    {
        return "Chicken: cock-a-doodle-doo";
    }
    /*
    Purpose: allow the chicken to be cloneable and return a chicken object
    Arguments:
    Outputs: Chicken
    Notes:
    */
    @Override
        public Chicken clone() throws CloneNotSupportedException{
           
        return (Chicken)super.clone();

    }
}
