package Q1;
import java.util.Scanner;

public class strint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();

        for (int lcv = 0; lcv <str.length(); lcv++){
            String c = str.substring(lcv,lcv+1);
            System.out.println("First non repeating charicter is: " + c);
            break;
        }
    }
}
