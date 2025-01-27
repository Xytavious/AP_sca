package Q3.Prog505a;

public class Bookperson {
    private String myName;
    private int myBooks;
    private int myPoints;

    public Bookperson(String name, int books){
        myBooks = books;
        myName = name;
        myPoints =0;
    }

    public void calc(){
        if (myBooks <=3)
            myPoints = myBooks *10;
        else if (myBooks <=6)
            myPoints = (myBooks-3) * 15+30;
        else
            myPoints = (myBooks-6) * 20 + 30 +45;
    }

    public String getMyName()   {return myName;}
    public int getMyBooks()     {return myBooks;}
    public int getMyPoints()    {return myPoints;}

    @Override
    public String toString(){
        return myName + '/' + myBooks + '/' + myPoints;
    }
}
