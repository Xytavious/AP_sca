package Q1.Prog52aCl;

import java.util.Scanner;

public class prog52aCl { // Driver class (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lenght: ");
        int l = input.nextInt();
        System.out.println("Enter width");
        int w = input.nextInt();

        // clac
        Cl52a wow = new Cl52a(l,w);  // nre object of "Cl52a" Class
        wow.calc();  // dont forget to call clac or somthing()!!!!
        int area = wow.getArea();
        int perim = wow.getPerim();

        // output section
        System.out.println("Rectangle area: " + area);
        System.out.println("rectangle perim " + perim);
    }
}
