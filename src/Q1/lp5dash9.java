package Q1;

public class lp5dash9 {
    public static void main(String[] args) {System.out.println("x^1\t\t x^2\t\t x^3\t\t x^4\t\t x^5 ");
        for (int i = 1; i <=6; i++) {
            double sec=(int) Math.pow(i,2);
            double th =(int) Math.pow(i,3);
            double forth =(int) Math.pow(i,4);
            double fith =(int) Math.pow(i,5);

            System.out.println(i + " \t\t " +sec +" \t\t " + th + " \t\t " + forth +" \t\t " +fith);
        }
    }
}
/*
x^1		 x^2		 x^3		 x^4		 x^5
1 		 1.0 		 1.0 		 1.0 		 1.0
2 		 4.0 		 8.0 		 16.0 		 32.0
3 		 9.0 		 27.0 		 81.0 		 243.0
4 		 16.0 		 64.0 		 256.0 		 1024.0
5 		 25.0 		 125.0 		 625.0 		 3125.0
6 		 36.0 		 216.0 		 1296.0 		 7776.0

Process finished with exit code 0

 */
