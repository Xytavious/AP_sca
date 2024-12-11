package Q2.Prog435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat")); // scans contents of the data file
            int[] scores = new int[100]; // makes new int array and sets it to 100
            int count=0; // sets count to zero

            while (file.hasNext()){  // while loop
                int score = file.nextInt(); // sets score to the net nunber in the file
                scores[count] = score; // acts like an array list
                count++; // adds one to count
                //scours[count++] = file.nextInt();

            }
            // sort the scores with (bubble sort)
            for (int j =0; j< count;j++){   // for loop
                for (int k=0;k<count-1;k++){   // for loop
                    if (scores[k]> scores[k+1]){ // black magic
                        int temp = scores[k];
                        scores[k] = scores[k+1];
                        scores[k+1]=temp;
                    }
                }
            }
            Cl435g[] golfers = new Cl435g[count]; // new array
            for (int lcv = 0; lcv < count; lcv++){ // for loop
                Cl435g cooldude = new Cl435g(scores[lcv]);
                golfers[lcv] = cooldude;

            }
            int rank = 1;
            for (int lcv=0;lcv<count; lcv++){
                golfers[lcv].setRank(rank);
                if (lcv < count-1 && scores[lcv] != scores[lcv+1])
                    rank++;
            }
            System.out.println("Score\tRank");
            for (int lcv = 0; lcv<count;lcv++)
                System.out.println(golfers[lcv].toString());
        }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
