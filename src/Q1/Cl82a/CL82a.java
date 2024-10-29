package Q1.Cl82a;

public class CL82a {
    private int num1;
    private int num2;
    private double fine;
    private int dif;

    public CL82a(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        dif= 0;
        fine=0;

    }
    public void calc(){
        dif = num1 - num2;
        fine = 20.00 +(dif * 5.00);
    }
    public double getFine() {
        return fine;
    }
}

