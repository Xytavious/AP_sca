package Q1;
import java.util.*;
public class Lang93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Kilowatts Used ");
        double kw = input.nextDouble();
        System.out.println();

        double bill = kw * 0.0475;
        double sur = (bill/10);
        double CyTax = (bill* 0.03);
        double tot = bill + sur + CyTax;
        double Late = tot * 0.04;
        double lateTOT = tot + Late;

        System.out.println("Base Rate " + kw + " @  $0.0475 " + bill);
        System.out.println("Surcharge " + sur);
        System.out.print( "City Tax " + CyTax + "\n");
        System.out.println("\n Pay this amount " + tot);
        System.out.println("\n After May 20th Pay " + lateTOT);




    }
}
/*
Enter Kilowatts Used 993

Base Rate 993.0 @  $0.0475 47.167500000000004
Surcharge 4.71675
City Tax 1.415025

 Pay this amount 53.299275

 After May 20th Pay 55.431246

 */
