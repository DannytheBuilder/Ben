import java.util.Scanner;
public class Bakery 
{
    private String Name = null;
    static Scanner input = new Scanner(System.in);
    
    public Bakery(String Name)
    {
        this.Name = Name;
    }

    public String getBakeName()
    {
        return Name;
    }

    public void setBakeName(String Name)
    {
        this.Name = Name;
    }
    
    
    
    public String toString()
    {
        return Name + "'s Bakery";
    }
}
