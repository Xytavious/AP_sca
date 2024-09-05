package Q1;

public class MathTest {
    public static void main(String[] args){
        int twoCubed = (int)Math.pow(2,3);  // 2^3

        int num1 = 5 ;
        int num2 =6;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        sum /= 3; // sum = sum / 3


        num1 = num1 + 1;
        num1 += 1;
        num1++;  // and -- for subtracting 1

        // arithmic opps + - * / %
        // assignment ops = += -= *= /= %= ++ --

        int test = 3/4; // equals 0 because of int divsion; use 3/4.0 instead and save in a double
        System.out.println(test);

        final double pi = 3.14159; // final means constant

        double mywall = 3431500.514345140585;
        double mywallRounded = Math.round(mywall * 100.0) /100.0; // how to round This wa is kinda BAD!!

        System.out.println(mywallRounded);
        System.out.printf("mywallRounded = %.2f\n", mywall); // %.#f # of decimals

    }
}
