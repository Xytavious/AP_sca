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

        int myThird = array[2];
        array[2]=5;
        System.out.println("The number that was outsted is " + myThird);

        for (int num: array)
            if(num>=50&&num<=59)
                System.out.println(num + " ");

        for (int i =0; i < array.length; i++)
            if(array[i]%4==0)
                System.out.println(array[1] +" ");

        boolean sixty = false;
        for (int n : array)
            if (n ==60) sixty = true;
        System.out.println("Is 60 in the list: " + sixty);

        boolean same = true;
        for (int lcv = 0; lcv< array.length; lcv++)
            if (array[lcv]!= array[(array.length-1)-lcv])
                same = false;
        System.out.println("Is the array palindromeic: "+same);

        double average = 0;
        for (int x : array )
            average += x;
        average /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x >average) average++;
        System.out.printf("There are %d numbers greator then the average\n", avgCount);

        int evens = 0;
        for (int num : array)
            if (num % 2 ==0)evens++;
        System.out.printf("There are %d even numbers\n", evens);

        int[] array2 = new int[array.length];
        for (int i = 0; i< array.length; i++)
            array2[i] = array[(array.length-1) -1];

        //17
        int[] shiftArr = CshiftR(array);
        for (int n : shiftArr)
            System.out.print(n+ " ");
        System.out.println("");

        for (int n : array2)
            System.out.print(n +" ");
        System.out.println("");


        int sum = 0;
        for (int num : array){
            int digitsum = 0;
            int temp = num;
            while (temp > 0){
                int n = temp % 10;
                temp/= 10;
                digitsum += n;
            }
            sum += digitsum;

        }
        System.out.println("Sum of all Digits of all elements: " +sum);


    }
    public  static int[] CshiftR(int[]arr){
        int temp = arr[arr.length-1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv]= arr[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
