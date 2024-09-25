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
        double numQ = (numD /4) %25 *100 ;
        double numDi = (numQ /2.5) %10 ;
        double numN = (numDi %2 );

        double prePen = change - numQ ;
        double pre1 =  change-numDi ;
        double pre2 =  change-numN ;
        numD = numD *100;
        double pre3 =  change - numD ;

        double pen = prePen;

        System.out.println("Change Due: " + change);

        System.out.println("dollars: " + numD);
        System.out.println("Quarters: " + numQ);
        System.out.println("Dimes: " + numDi);
        System.out.println("Nickels:" + numN);
        System.out.println("Pennies:" + pen);






    }
}
/*
Enter Price
125.32
Enter amount recived:
140.00
Change Due: 14.680000000000007
dollars: 14.680000000000007
Quarters: 2.00670000000000002
Dimes: 1.004680000000000007
Nickels:1.004680000000000007
Pennies:3.300000000000007
 */
