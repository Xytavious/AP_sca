package Q1;

import java.util.*;
public class Prog54b {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Enter Number: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Enter Number: ");
        int num4 = input.nextInt();
        System.out.println();

        int tot = num1 + num2 + num3 + num4;
        double avg = tot / 4;


        System.out.println("sum = " + tot);
        System.out.println("average = " + avg);

    }
}
/*
Enter Second Number: 24

Enter Number: 12

Enter Number: 14

sum = 95
average = 23.0

 */
