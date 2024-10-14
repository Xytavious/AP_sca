package Q1;
import java.util.Scanner;
public class lp4dash10 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
       System.out.printf("\tEnter the length: ");
       int a = wow.nextInt();

       System.out.printf("\tEnter the Width: ");
       int b = wow.nextInt();

       System.out.printf("\tEnter the Height: ");
       int c = wow.nextInt();

       int rc= a*b*c;
       System.out.println("\tThe volume: " +rc);


       System.out.printf("\tEnter the Radius: ");
       int rad = wow.nextInt();
       int d = rad*2;
       double vol = (3.145 * Math.pow(d,3))/6;
       System.out.println("\tThe volume: " +vol);


       System.out.printf("\tEnter Length of each side: ");
       int gh = wow.nextInt();

       double vc = Math.pow(gh,3);
       System.out.println("\tThe volume: " + vc);

    }
}
/*
Enter the length: 3
	Enter the Width: 4
	Enter the Height: 5
	The volume: 60
	Enter the Radius: 3
	The volume: 113.22000000000001
	Enter Length of each side: 4
	The volume: 64.0

Process finished with exit code 0

 */