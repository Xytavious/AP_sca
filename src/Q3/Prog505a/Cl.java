package Q3.Prog505a;

import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Cl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505a.dat"));
            List<Bookperson> list = new ArrayList<Bookperson>();


            while (file.hasNext()){
                String fname = file.next();
                String lname =file.next();
                int books = file.nextInt();
                String name = fname + " "+ lname;
                Bookperson wowser = new Bookperson(name, books);
                list.add(wowser);
            }

            for (int lcv = 0; lcv < list.size(); lcv++){
                Bookperson cur = list.get(lcv);
                cur.calc();
            }

            System.out.println("reading Contest: \nName\tBooks\tPoints");
            for (Bookperson p : list)
                System.out.println(p);

            double tot = 0;
            for (Bookperson p : list) tot += p.getMyPoints();
            double avg = tot / list.size();
            System.out.println("\nAvarage points " +avg);

            int bestpoints = list.get(0).getMyPoints();
            String bestName = list.get(0).getMyName();
            for (int lcv = 1; lcv < list.size(); lcv++){
                Bookperson bill = list.get(lcv);
                if (bill.m())
            }


        }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}

