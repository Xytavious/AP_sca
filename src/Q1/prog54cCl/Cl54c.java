package Q1.prog54cCl;

public class Cl54c {
    double num1;
    double p;
    double area;

    public Cl54c(double a) {
        p=0;
        area =0;
        num1=a;
    }

    public void calc() {
        area = 3.14159 * (int)Math.pow(num1,2);
        p = 2 * 3.14159 * num1;
    }

    public double getNum1() {
        return num1;
    }

    public double getArea() {
        return area;
    }

    public double getP() {
        return p;
    }
}
