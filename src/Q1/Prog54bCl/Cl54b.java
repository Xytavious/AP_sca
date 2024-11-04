package Q1.Prog54bCl;

public class Cl54b {
        int num1;
        int num2;
        int num3;
        int num4;
        int tot;
        double avg;

        public Cl54b(int a, int b, int c, int d) {
            num3 = c;
            num2 =b;
            num4 = d;
            num1=0;
        }

        public void calc() {
            tot = num1 + num2 + num3 + num4;
            avg = tot / 4;
        }

        public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }

        public int getNum3() {
            return num3;
        }

        public int getNum4() {
            return num4;
        }

        public int getTot() {
            return tot;
        }

        public double getAvg() {
            return avg;
        }
    }


