package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for(int lcv = 0; lcv < array.length; lcv++)
            array[lcv]=(int)(Math.random()* (91 - 20) +20); // random() * (max-min) + min)
        System.out.println("");
        // Step 1
        for (int i =0; i < array.length; i++)
            System.out.println(array[i]+ " ");

        // step 2

        for (int temp:array)
            System.out.println(temp + " ");
        System.out.println("");

        // Step 3
        System.out.println("The middle number is " + array[array.length /2 ]);

        // step 4
        double avg = array[0]+ array[array.length-1]+array[array.length/2];
        System.out.println("Average of the first, middle, and last number is: "+ (avg/3));

        // Step 5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array){ // : means in
            if (num < smallest) smallest=num;
            if (num > largest) largest=num;
        }

        // Step 6
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i<array.length; i++){
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }

        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.println(x + " ");


        int randNum = (int) (Math.random()*10+1);
        array[array.length / 2] = randNum;

        for (int x : array)
            System.out.println(x + " ");

        for (int i =0; i < array.length; i++)
            array[i] += 10;

        for (int x : array)
            System.out.println(x + " ");

        int myThird = arrayp[2];
        array[2]=5;
        System.out.println("The number that was outsted is " + myThird);

    }
}
