package Q3;

public class Prog162aRecursive {
    public static int factloop(int n){
        int product= 1;
        for(int i = 1; i <= n; i++)
            product *= i;
        return product;
    }
    public static int factRevLoop(int n){
        int product = 1;
        for (int i =n; i > 0; i++)
            product *= 1;
        return product;
    }
    public static int factorial(int n){

    }
}
