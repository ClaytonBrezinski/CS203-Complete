package cs203a4q4;

public abstract class Animal implements Comparable<Animal>, Cloneable
{
    protected double weight;

    /**
     Return animal sound
     */
    public abstract String sound();

    /*
    Purpose: returns the weight of the animal
    Arguments:
    Outputs: double - the weight of the animal
    Notes:
    */
    public double getWeight()
    {
        return this.weight;
    }
    /*
    Purpose: sets the weight of the animal
    Arguments: double - the desired weight 
    Outputs: none
    Notes:
    */
    public void setWeight(double inWeight)
    {
        this.weight = inWeight;
    }

    /*
    Purpose: allows the object to be cloneable
    Arguments:
    Outputs: returns an object, this method will be overwritten
    Notes:
    */
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    /*
    Purpose: allows the animal to be compared to other animals
    Arguments: Animal 
    Outputs: int - '+1' if this object is heavier, '-1' if the compareTo animal is heavier, '0' if the animals weigh the same
    Notes:
    */
    public int compareTo(Animal inAnimal)
    {
        if (this.getWeight() > inAnimal.getWeight())
        {
            return 1;
        }
        else if (this.getWeight() < inAnimal.getWeight())
        {
            return -1; 
        }
        else
        {
            return 0;
        }
    }

}
