package Q1;
import java.util.Scanner;
public class Lp4dash6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        int r =(int) (Math.random()*(10 - 1) + 1);
        int f =(int) (Math.random()*(20 - 1) + 1);
        int t =(int) (Math.random()*(4 - 1) + 1);
        int op;
        if (t == 1){
            op = (r + f);
            System.out.println("what is " + r +" + "+f);
        }
        else if (t==2){
            op = (r*f);
            System.out.println("what is " + r +" * "+f);
        }
        else if (t==3){
            op = (r-f);
            System.out.println("what is " + r +" - "+f);
        }
        else{
            op = (r/f);
            System.out.println("what is " + r +" / "+f);
        }


        System.out.println("Enter Number:");
        int user = wow.nextInt();
        if (user == op){
            System.out.println("Correct!!!");
        }
        else{
            System.out.println("Wrong!");
        }

    }
}
