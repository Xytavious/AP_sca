package Q2;
import java.util.Scanner;
public class Lp3dash9 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Enter Your Birthdate: ");
        // 1 year = 365  months 1 month = 30 days day =1



        System.out.println("Year:");
        int year = wow.nextInt();

        System.out.println("Month:");
        int month = wow.nextInt();

        System.out.println("Day:");
        int day = wow.nextInt();

        System.out.println("Enter todays Date:");

        System.out.println("Year:");
        int Tyear = wow.nextInt();

        System.out.println("Month:");
        int Tmonth = wow.nextInt();

        System.out.println("Day:");
        int Tday = wow.nextInt();


         int yd= (Tyear -year) *365;
         int md= (Tmonth - month) * 12;
         int dd = Tday - day;
         int we = (yd + md +dd);
         System.out.println(we);
         int tot = (we *24 )/8;
         System.out.println(tot);

    }
}
