package Q1.prog93cl;

public class cl93a {
    private int kwh;
    private double baserate;
    private double surcharge;
    private double citTax;
    private double total;
    private double lateTotal;

    public cl93a(int kwh)
    {
        this.kwh = kwh;
        baserate = 0;
        surcharge =0;
        citTax = 0;
        total = 0;
        lateTotal = 0;

    }

    public void calc() {} //todo

    public String toString() {
        return "KWH used: " +kwh +
                "\nbBase rate: "+ baserate+
                "\nSurchrge: " + surcharge; // todo: the rest
    }
}
