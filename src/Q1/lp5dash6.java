package Q1;
import java.util.Scanner;
public class lp5dash6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Enter A 3 Digit Number:");
        int ps = wow.nextInt();
        double ef= ps % 10;
        double tr = ps %100 -ef;
        double trev = ps - tr -ef;

        double se = tr /10;
        double res = trev /100;

        double sol = ef + se + res;
        System.out.println("The sum of the digits: " + sol);
    }
}
