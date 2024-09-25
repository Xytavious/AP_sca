package Q1;
import java.util.Scanner;
public class MSOE20141 {
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter word: ");
        String word =kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt =0;

        // how to check for double letters

        for (int lcv = 0; lcv < word.length() -1; lcv++){
            String cletter = word.substring(lcv,lcv+1); //word[lcv]
            String nletter = word.substring(lcv+1, lcv+2); //word[lcv+1]
            if (cletter.equals(nletter))
                dblcnt++;
         }
        System.out.printf("%s contains %d double letters \n", word,dblcnt);

    }
}
/*
enter word:
coolbeens
coolbeens contains 2 double letters

 */
