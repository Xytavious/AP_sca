package Q2.Prog213v;

public class Bank {
    private double myAmount;

    public Bank(double amount) {myAmount = amount;}
    public double getAmount() {return myAmount;}

    public void calc(Transaction thing){
        if (thing.getcode().equals("D"))
            myAmount += thing.getamount();
        else if (thing.getCode().equals("S"))
            myAmount -= thing.getamount();

    }
}
