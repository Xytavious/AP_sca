package Q2.prog402a;

public class Cl402a {
    private int id;
    private int score;
    private double diff;


    public Cl402a(int d, int s){
        id = d;
        score = s;
        diff = 0;
    }
    public void calc(double avg){
        diff = score - avg;
    }

    public int getScore() {
        return score;
    }
}
