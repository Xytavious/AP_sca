package Q3.prog701g;

public class Student extends Person{
    private  double myGPA;

    public Student(String fn, String ln, double gpa){
        super(fn, ln); // Call the super-class aka the parent constructor
        myGPA = gpa;
    }

    public double getMyGPA() {
        return myGPA;
    }
}
