package Q1;
import java.util.*;
public class Prog58t {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Price");
        double price = input.nextDouble();

        System.out.println("Enter amount recived:");
        double rec = input.nextDouble();

        double change = rec - price;


        int dollars = 0;
        int Qu = 0;
        int Dimes =0;
        int nik = 0;
        int pen =0;

        while (change > 1)
        {
            dollars ++;
            change --;
        }
        while (change >= .25)
        {
            Qu +=1;

        }



        System.out.println("Change Due: " + change);


    }
}
