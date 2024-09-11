package Q1;

public class Prog88a {
    public static void main(String[] args){
        // enter number 1-13
        // enter number 2-20
        // Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 -1)) + 1;
        int num2 = (int)(Math.random() *(20-2))+2;
        int dif = num1 - num2;
        // TODO: product and average
        int abs = Math.abs(dif);
        int max, min;

        // The code inside 'if' will only run if the codition is true
        if (num1 > num2){
            max = num1;
            // min = num2;
        } else
        {  // otherwise...
            max = num2;
            // min = num1;
        }
        //
        if (max == num1){
            min = num2;
        } else{
            min = num1;
        }
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
