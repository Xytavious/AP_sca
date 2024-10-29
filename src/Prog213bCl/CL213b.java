package Prog213bCl;

public class CL213b {
    private int myQuanity;
    private double myPrice;
    private double myAmtDue;

    public CL213b(int quanity){
        myQuanity = quanity;
        myPrice = 0;
        myAmtDue = 0;

    }
    public  void calc() {
        if (myQuanity > 0 && myQuanity <= 99) myPrice = 5.95;
        else if (myQuanity > 99 && myQuanity <= 199) myPrice = 5.75;
        else if (myQuanity > 199 && myQuanity <= 299) myPrice = 5.40;
        else if (myQuanity > 299) myPrice = 5.15;
        myAmtDue = myPrice * myQuanity;
    }

    public String tostring() {
        return String.format("Qunity: %d\tPrice: $%.2f\tAmout Due: $%.2f", myQuanity,myPrice,myAmtDue);
    }
}
