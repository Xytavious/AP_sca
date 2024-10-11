package Q1;
import java.util.Scanner;
public class lp4dash3 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        System.out.println("Number of eggs Perched: ");
        int eggs = wow.nextInt();
        double per;

        if (eggs > 0 && eggs <4)
        {
            per = eggs * 0.50;
            System.out.println("Number of eggs "+eggs +"the bill " + per);

        }
        else if (eggs >= 4 && eggs < 6)
        {
            per = eggs * 0.45;
            System.out.println("Number of eggs "+eggs +"the bill " + per);
        }
        else if (eggs >= 6 && eggs <  11)
        {
            per = eggs * 0.40;
            System.out.println("Number of eggs "+eggs +"the bill " + per);
        }
        else if (eggs > 11)
        {
            per = eggs * 0.35;
            System.out.println("Number of eggs "+eggs +"the bill " + per);

        }


    }
}
