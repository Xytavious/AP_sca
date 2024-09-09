package Q1;
import java.util.*;
public class prog58h {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount saved ");
        double AS = input.nextDouble();
        System.out.println();

        System.out.println("Enter intrist rate ");
        double IR = input.nextDouble();
        System.out.println();

        System.out.println("Enter number of times compounded per year ");
        double CPY = input.nextDouble();
        System.out.println();

        System.out.println("Enter number of days compounded: ");
        double NOD = input.nextDouble();
        System.out.println();

        double Interest = AS *(1+((.01 * IR)/NOD * CPY* NOD / 365);
    }
}
