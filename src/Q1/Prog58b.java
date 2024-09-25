package Q1;
import java.util.*;
public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter A,:   ");
        int a = input.nextInt();

        System.out.printf("Enter B,:   ");
        int b = input.nextInt();

        System.out.printf("Enter C: ");
        int c = input.nextInt();

        double Ra = Math.pow(a,1/2);
        double Rb = Math.pow(b,1/2);
        double Rc = Math.pow(c,1/2);

        System.out.println(Ra);


    }
}
