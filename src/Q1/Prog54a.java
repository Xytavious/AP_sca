package Q1;
import java.util.*;
public class Prog54a {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // int, double, bool, String
        System.out.print("Enter the cat model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven ");
        int miles = keyboard.nextInt();

        System.out.print("Enter the gals used");
        int gal = keyboard.nextInt();

        double mpg =miles / (double)gal;
        System.out.print("mpg used by " + model + " is " + mpg + "m/g");

    }
}
