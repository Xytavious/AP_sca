package Q1;
import java.util.Scanner;
public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.printf("Enter the vehicle speed: ");
        int speed = input.nextInt();

        int dif = speed - limit;

        double fine = 20.00 +(dif * 5.00);

        System.out.println("Fine:----------------" +"$" + fine);

    }
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine:----------------$80.0
 */
