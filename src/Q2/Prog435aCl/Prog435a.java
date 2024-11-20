package Q2.Prog435aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
            int[] toll = new int[100];
            // file will take in car type and gate;
            while (file.hasNext()){

            }
        }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());
        }
    }

}
