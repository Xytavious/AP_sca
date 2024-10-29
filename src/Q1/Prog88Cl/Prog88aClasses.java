package Q1.Prog88Cl;
import java.util.Scanner;
public class Prog88aClasses {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num1 = wow.nextInt();

        System.out.println("Enter A Number: ");
        int num2 = wow.nextInt();


        CL88a us = new CL88a(num1,num2);
        us.calc();
        System.out.println("sum " +us.getSum());
        System.out.println("Dif "+ us.getDif() );
        System.out.println("Product " +us.getProduct());
        System.out.println("Avg " + us.getAvg());
        System.out.println("abs " + us.getAbs());
        System.out.println("Max "+ us.getMax());
        System.out.println("Min "+ us.getMin());

    }
}
