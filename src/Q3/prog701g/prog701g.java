package Q3.prog701g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class prog701g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            List<Person> list = new ArrayList<Person>();

            int num = file.nextInt();
            while (num!=99){
                String f = file.next();
                String l = file.next();

                if (num == 1) {
                    double gpa = file.nextDouble();
                    Person p = new Student(f,l,gpa);
                    list.add(p);
                } else if (num ==2) {
                    int ns = file.nextInt();
                    Person p = new Teacher(f,l,ns);
                    list.add(p);
                }else if (num==3) {
                String fw = file.next();
                    Person p = new Admin(f,l,fw);
                    list.add(p);
                }
                num = file.nextInt();

            }

            double tot = 0;
            int cnt = 0;
            int totsut= 0;
            String large = "";
            String small = "ioauohbgajlhdlfhbalwehbf;lkawgflakjhglkjgf;lkajhrkgflqahglfdkfkjgalbkdufohiuwahflkjbalfvblyagrlalkjdhfaoiwhlkjdhfaliuwhelkjhldkashfiuwflkajhf";
            for (Person p : list) {
                if (p instanceof Student) {
                tot += ((Student)p).getMyGPA();
                cnt++;
                }else if (p instanceof Teacher) {
                totsut += ((Teacher)p).getMyNumStu();
                } else if(p instanceof Admin) {
                String word = ((Admin)p).getMyFavW();
                if (word.length() > large.length())
                    large = word;
                if (word.length() < small.length())
                    small = word;
                }
            }

            System.out.printf("Average student GPA: %.2\n", tot/cnt);
            System.out.println("Total number of students taught by teachers: " + totsut);
            System.out.println("Smallest Facorite Admin word: " + small);
            System.out.println("Largest Favorite Admin word: " + large);

        }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}

