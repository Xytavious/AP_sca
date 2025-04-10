package Q3.Cl470a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg470a.dat"));
            int[][] powers = new int[5][5];
            for (int row = 0; row < powers.length; row++) {
                for (int col = 0; col < powers[0].length; col++) {
                    powers[row][col] = (int) Math.pow(col + 1, row + 1);


                    while (file.hasNext()) {

                    }
                }
                }
            }
        catch(IOException e){
            System.out.println("Error: " + e.getStackTrace());
    }

}