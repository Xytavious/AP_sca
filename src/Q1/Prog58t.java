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

        double numD = (change /100) % 100;
        double numQ = (change %25 )



        System.out.println("Change Due: " + change);


    }
}
