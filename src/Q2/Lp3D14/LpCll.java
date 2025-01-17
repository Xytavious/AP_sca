package Q2.Lp3D14;

public class LpCll {
    private int An;
    private int Aj;
    private int AC;
    private int Mn;
    private int Mj;
    private int Mc;
    private double av;
    private double mv;
    private int tot;

    public void LpCLl(int an, int aj, int ac, int mn, int mj, int mc){
        An = an;
        Aj = aj;
        AC = ac;
        Mn = mn;
        Mj = mj;
        Mc = mc;

        av = ((double)An + Aj + AC) /3;
        mv = ((double) Mn + Mj + Mc)/3;
        tot = An + Aj + AC + Mn + Mj + Mc;

    }

    public int getAn() {
        return An;
    }

    public int getAj() {
        return Aj;
    }

    public int getAC() {
        return AC;
    }

    public int getMn() {
        return Mn;
    }

    public int getMj() {
        return Mj;
    }

    public int getMc() {
        return Mc;
    }

    public double getAv() {
        return av;
    }

    public double getMv() {
        return mv;
    }

    public int getTot() {
        return tot;
    }

}
