package Q1;
import java.util.Scanner;
public class lp4dash2 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.println("Enter package weight in kilograms:");
        int pgw = wow.nextInt();
        System.out.println("Enter Package length in centermeters:");
        int len = wow.nextInt();
        System.out.println("Enter package Width in centermeters:");
        int wid = wow.nextInt();
        System.out.println("Enter Package hight in centermeters:");
        int hi = wow.nextInt();



        double cubic = (len * wid *hi);
        if (pgw > 27)
        {
           System.out.println("Too heavy. ");
        }
        else if (pgw > 27 && cubic > 100000)
        {
            System.out.println("Too heavy and Too Large. ");
        }
        else if (cubic > 100000)
        {
            System.out.println("Too large.");
        }

    }
}
/*
Enter package weight in kilograms:
32
Enter Package length in centermeters:
10
Enter package Width in centermeters:
25
Enter Package hight in centermeters:
38
Too heavy.

Process finished with exit code 0

 */
