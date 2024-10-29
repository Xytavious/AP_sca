package Q1.Prog88Cl;

public class CL88a {
    private int num1;
    private int num2;
    private int sum;
    private int dif;
    private int product;
    private double avg;
    private int abs;
    private int max, min;

    public CL88a(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        sum = 0;
        dif = 0;
        product = 0;
        avg = 0;
        abs = 0;
        max = 0;
        min = 0;
    }

    public void calc() {
        sum = num1 + num2;
        dif = num1 - num2;
        product = num1 * num2;
        avg = (num1 * num2) /2;
        abs = Math.abs(dif);

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

    }

    public int getSum() {
        return sum;
    }

    public int getDif() {
        return dif;
    }

    public int getProduct() {
        return product;
    }

    public double getAvg() {
        return avg;
    }

    public int getAbs() {
        return abs;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}

