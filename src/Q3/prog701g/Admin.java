package Q3.prog701g;

// Child of person class
public class Admin  extends Person{
    private String myFavW;
    // inherited first and last name (indirectly) from person

    public Admin(String fn, String ln, String fav){
        super(fn, ln);
        myFavW = fav;
    }

    public String getMyFavW() {
        return myFavW;
    }
}
