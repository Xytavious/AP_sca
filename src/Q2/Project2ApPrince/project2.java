package Q2.Project2ApPrince;


import java.util.ArrayList;
import java.util.Scanner;

public class project2 {
    public static void printPas(Password p){
        System.out.printf("%s\t%s\t%d\n",
                p.getWebsite(), p.getUsername(), p.getPassword());
    }
    public static int indexofPas(ArrayList<Password> db,String us){
        for (int i = 0; i< db.size(); i++)
            if (db.get(i).getWebsite().equals (us)) return i;
        return -1;
    }
    public static int indexofPa(ArrayList<Password> db,int us){
        for (int i = 0; i< db.size(); i++)
            if (db.get(i).getPassword()== (us)) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Password> db = new ArrayList<>();

        while (true){
            System.out.println("Password Manager Menu:");
            System.out.println("1 - Add new Password: "); // done 1
            System.out.println("2 - Display all Passwords"); // done 2
            System.out.println("3 - Search by Password)");// done
            System.out.println("4 - Modify Password");  //3
            System.out.println("5 - Remove password (by website)"); // 4
            System.out.println("6 - Exit");
            System.out.print("Please enter your choice:");
            int c = input.nextInt();

            if (c ==1){
                System.out.print("Enter Website Name: ");
                String w = input.next();
                System.out.print("Enter Username: ");
                String u = input.next();
                System.out.print("Enter Password: ");
                int pas = input.nextInt();
                Password st = new Password(w,u, pas);
                db.add(st);

            } else if (c==2){
                System.out.println("Username\tPassword");
                for (Password s : db)
                    printPas(s);

            }else if (c==3){
                System.out.print("Enter Last Password you remember  : ");
                int we= input.nextInt();
                int index = indexofPa(db,we);
                if (index != -1)printPas(db.get(index));
                else System.out.println("No Password was found.");

            }else if (c==4){

                System.out.print("Enter Website Name: ");
                String us= input.next();
                int index = indexofPas(db,us);
                if (index == -1)System.out.println("No Website was found with that Name.");
                else{
                    System.out.print("Enter Password: ");
                    int wer= input.nextInt();
                    db.get(index).setPassword(wer);
                    System.out.println("Password updated Successfully!");

                }
            }else if (c==5){
                System.out.print("Enter Website Name: ");
                String id = input.next();
                int index = indexofPas(db, id);
                if (index == -1) System.out.println("No website was found with that Name.");
                else db.remove(index);
            }else if (c==6){
                return;
            }
        }
    }
}

 