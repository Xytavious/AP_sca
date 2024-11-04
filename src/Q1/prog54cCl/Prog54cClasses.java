package Q1.prog54cCl;
import java.util.Scanner;
public class Prog54cClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the Radius of the Circle ");
        double num1 = input.nextDouble();
        System.out.println();

        Cl54c osu =new Cl54c(num1);
        osu.calc();

        System.out.println(osu.area);
        System.out.println(osu.p);

    }
}
