package Q1;
import java.util.Scanner;
public class prog122d {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        for (int i = -12; i <=16; i++) {
            double y = (Math.pow(i,6) -3 *Math.pow(i,5)-93 * Math.pow(i,4)+87*Math.pow(i,3)+1596*Math.pow(i,2) -1380 *i - 2800);
            System.out.println(i + "\t" + y);
        }

    }
}
