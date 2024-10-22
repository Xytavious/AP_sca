package Q1;
import java.util.Scanner;
public class lp5dash5 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Enter A 3 Digit Number");
        int us = wow.nextInt();
        double yt= us % 10;
        double mr = us %100 -yt;
        double ta = us - mr -yt;

        double bob = mr /10;
        double boo = ta /100;
        double eoe = ta ;
        System.out.println(boo);
        System.out.println(bob);

        System.out.println(ta);
    }
}
