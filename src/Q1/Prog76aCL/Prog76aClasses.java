package Q1.Prog76aCL;
import java.util.Scanner;
public class Prog76aClasses {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Enter a number you Dislike:/ ");
        int dis= wow.nextInt();

        Cl76a po = new Cl76a(dis);
        po.calc();
        System.out.println(dis + " X " + po.num1);
        System.out.println(po.a1 + " X " + po.s);
        System.out.println(" Suprise!!! Scrub (>w<`)  " + po.strange + "  X_X" );


    }
}
