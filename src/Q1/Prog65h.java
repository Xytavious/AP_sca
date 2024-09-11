package Q1;
import java.util.*;
public class Prog65h {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pounds ");
        int pound = input.nextInt();
        System.out.println();

        System.out.print("Enter Shillings ");
        int shilly = input.nextInt();
        System.out.println();

        System.out.print("Enter pence ");
        int pence = input.nextInt();
        System.out.println();

        /*
        1 shilling = 12 pence
        20 shillings = 1 pound
        convert to only
        pounds and pence
        */
        if (shilly == 20 ){
            pound = pound + 1;

        }

    }
}
