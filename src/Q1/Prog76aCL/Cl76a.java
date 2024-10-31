package Q1.Prog76aCL;

public class Cl76a {
    int dis;
    int s;
    int a1;
    int strange;
    int num1;

    public Cl76a(int a){
        dis = a;
        s =0;
        a1=0;
        strange = 0;
        num1=0;
    }
    public void calc(){
        num1 =9;
        a1 = dis * num1;
        s = 12345679;
        strange = a1 *s;
    }

    public int getNum1() {
        return num1;
    }

    public int getA1() {
        return a1;
    }

    public int getS() {
        return s;
    }

    public int getStrange() {
        return strange;
    }

    public int getDis() {
        return dis;
    }
}
