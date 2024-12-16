package Q2.Project2ApPrince;

public class Password {
    private String website;
    private String Username;
    private int password;

    public Password(String we, String us,int pa){
        website = we;
        Username = us;
        password = pa;
    }

    public String getWebsite() {
        return website;
    }

    public String getUsername() {
        return Username;
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int pa) { password = pa; }
}
