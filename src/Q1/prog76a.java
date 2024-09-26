package Q1;
import java.util.Scanner;
public class prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number you Dislike :( ");
        int dis = input.nextInt();

        int num1 = 9;
        int a1 = dis * num1;

        int s = 12345679;
        int strange = a1 * s;

        System.out.println(dis + " X " + num1);
        System.out.println(a1 + " X " + s);
        System.out.println(" Suprise!!! Scrub (>w<`)  " + strange + "  X_X" );

    }
}
/*
Enter a number you Dislike :( 7
7 X 9
63 X 12345679
 Suprise!!! Scrub (>w<`)  777777777  X_X

 */
