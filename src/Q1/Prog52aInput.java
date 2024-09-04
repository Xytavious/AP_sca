package Q1;
import java.util.*;
public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Enter width:");
        int wid = input.nextInt();
        System.out.println();

        int area = len * wid;
        int perim = 2 * len + 2 * wid;

        System.out.println("Area = " + area);
        System.out.println("perim = " + perim);


    }
}
/*
Enter length: 54

Enter width:5684

Area = 306936
perim = 11476

 */
