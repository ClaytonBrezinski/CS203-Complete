/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package cs203a4q4;

/**

 @author Dolan
 */
public class CS203A4Q4
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            Animal[] list = new Animal[5];
            list[0] = new Chicken();
            list[0].setWeight(4.5);
            list[1] = new Tiger();
            list[1].setWeight(46.6);
            list[2] = new Chicken();
            list[2].setWeight(1.5);
            list[3] = (Animal) (list[0].clone());
            list[3].setWeight(7.5);
            list[4] = (Animal) (list[1].clone());

            java.util.Arrays.sort(list);
            for (int i = 0; i < list.length; i++)
            {
                System.out.println("weight: " + list[i].getWeight());
            }
        }
        catch (Exception e)
        {
            System.out.println("CloneNotSupportedException");
        }
    }

}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/
