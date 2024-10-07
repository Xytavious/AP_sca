package Q1.Prog52aCl;

public class Cl52a { // rectangle {helper class}
    private int myLen;
    private int myWid;
    private int area;
    private int perim;

    // input (constructor)
    public Cl52a(int len,int wid){
        // set up private data
        myLen = len;
        myWid = wid;
        area = 0;
        perim = 0;

    }

    // calculation section (mutaiters/setters)
    public void calc()
    {
        area = myLen * myWid;
        perim = 2* myLen + 2 * myWid;

    }
    // output sec  (Accessors/Getters)
    public int getArea() {return area;}
    public int getPerim() {return perim;}

    // class methods are always public
    // class methods: "public <return_ type> <name> (<args>) "
}
