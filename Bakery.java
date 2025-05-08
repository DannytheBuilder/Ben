
public class Bakery 
{
    private String Name = null;
    public double Money = 0.0;
    public double debt = 0;
    // Bakery Stuff
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
        return Name + " Bakery";
    }

    //Money Section

    public void Payback()
    {
        if (debt > 0)
        {
            debt -= Money;
            if (Money < 0.01)
            {
                System.out.println("You are in debt.");
                Money += debt;
                Money = 0;
            }
        } else 
        {
            System.out.println("No debt to payback.");
        }
    }
}