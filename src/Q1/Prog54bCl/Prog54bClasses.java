package Q1.Prog54bCl;
import java.util.Scanner;
public class Prog54bClasses {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = wow.nextInt();
        System.out.println();

        System.out.print("Enter Second Number: ");
        int num2 = wow.nextInt();
        System.out.println();

        System.out.print("Enter Number: ");
        int num3 = wow.nextInt();
        System.out.println();

        System.out.print("Enter Number: ");
        int num4 = wow.nextInt();
        System.out.println();

        Cl54b osu = new Cl54b(num1,num2,num3,num4);
        osu.calc();
        System.out.println("sum = " + osu.tot);
        System.out.println("average = " + osu.avg);

    }

}
