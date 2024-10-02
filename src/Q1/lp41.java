package Q1;
import java.util.Scanner;
public class lp41 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.println("Enter number of pages: ");
        int numC = wow.nextInt();
        double tot;
        double per;
        if (numC > 0 && numC < 99)
        {
            per = 0.30;
            tot = numC * per;
            System.out.println("Price per is: " + per);
            System.out.println("Your total is: " + tot);

        }
        else if (numC >= 100 && numC < 499)
        {
            per = 0.28;
            tot = numC * per;
            System.out.println("Price per is: " + per);
            System.out.println("Your total is: " + tot);

        }
        else if (numC >=500 && numC < 749)
        {
            per = 0.27;
            tot = numC * per;
            System.out.println("Price per is: " + per);
            System.out.println("Your total is: " + tot);

        }
        else if (numC >= 750 && numC < 1000)
        {
            per = 0.26;
            tot = numC * per;
            System.out.println("Price per is: " + per);
            System.out.println("Your total is: " + tot);

        }
        else if (numC > 1000)
        {
            per = 0.25;
            tot = numC * per;
            System.out.println("Price per is: " + per);
            System.out.println("Your total is: " + tot);

        }



    }
}
