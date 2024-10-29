package Q1.Cl82a;

import java.util.Scanner;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.printf("Enter the vehicle speed: ");
        int speed = input.nextInt();

        CL82a pop = new CL82a(speed,limit);
        pop.calc();

        System.out.println("pop " + pop.getFine());
    }
}
