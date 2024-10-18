package Q1;

import java.util.Scanner;

public class lahgf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius of the Circle ");
        double num1 = input.nextDouble();
        System.out.println();


        double area = 3.14159 * (int) Math.pow(num1, 2);
        double p = 2 * 3.14159 * num1;

        System.out.println(area);
        System.out.println(p);
    }
}