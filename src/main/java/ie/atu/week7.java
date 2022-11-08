package ie.atu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class week7
{
    public static void main(String[] argos)
    {
        System.out.println("Please enter a number between 0 - 9 : ");
        Scanner myscan = new Scanner(System.in);
        try{
            int myNum = myscan.nextInt();
            if (myNum <= 9 && myNum > 0)
                {
                System.out.println("You entered " + myNum);

                }
            else{
                System.out.println("Not a valid number");
                }
            }
            catch(InputMismatchException h)
            {
                System.out.println("Error caught");
            }


    }


}
