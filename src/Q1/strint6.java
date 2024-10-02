package Q1;
import java.util.*;
public class strint6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        String text = wow.nextLine().toLowerCase().trim();
        int un = 0;
        text.indexOf(un);

        // Scanner kbd = new Scanner(System.in);
        //        System.out.println("enter word: ");
        //        String word =kbd.nextLine();
        //        word = word.toLowerCase();
        //        int dblcnt =0;
        //
        //        // how to check for double letters
        //
        //        for (int lcv = 0; lcv < word.length() -1; lcv++){
        //            String cletter = word.substring(lcv,lcv+1); //word[lcv]
        //            String nletter = word.substring(lcv+1, lcv+2); //word[lcv+1]
        //            if (cletter.equals(nletter))
        //                dblcnt++;
        //         }
        HashSet<String> alphabets = new HashSet<String>();

        for (int lcv = 0; lcv < text.length(); lcv++){
            String d = text.substring(lcv,lcv++);

        }
    }
}
