package Q1;
import java.util.*;
public class Lp4dash9 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        int r =(int) (Math.random()*(20 - 1) + 1);
        System.out.println("Enter a Number Between 1 and 20: ");
        int user = wow.nextInt();
        if(r==user){
            System.out.println("YOU WIN!!!! ");
            System.out.println("House's Number: "+r);
            System.out.println("Players Number: "+user);
        }
        else if (r != user){
            System.out.println("Try again x_____x");
            System.out.println("House's Number: "+r);
            System.out.println("Player's Number: "+user);
        }

    }
}
/*
Enter a Number Between 1 and 20:
15
Try again x_____x
House's Number: 1
Player's Number: 15
 */
