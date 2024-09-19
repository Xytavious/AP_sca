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

        System.out.println("Base Rate " + kw + "@  $0.0475" );




    }
}
