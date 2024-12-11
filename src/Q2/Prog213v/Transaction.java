package Q2.Prog213v;

public class Transaction {
    private String myType;
    private double myAmount;

    public Transaction(String type, double amount){
        myAmount = amount;
        myType = type;
    }
    public String getCode() {return myType;}
    public double getamount() {return myAmount;}
}
