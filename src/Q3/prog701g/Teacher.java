package Q3.prog701g;

public class Teacher extends Person {
    private int myNumStu;

    public Teacher(String fn, String ln, int stu){
        super(fn, ln);
        myNumStu = stu;
    }

    public int getMyNumStu() {
        return myNumStu;
    }
}
