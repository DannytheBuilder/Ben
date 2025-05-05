import java.util.ArrayList;
public class Bakery 
{
    private String Name = null;
    public double Money = 0.0;
    public double debt = 0;
    private ArrayList<Food> Current = new ArrayList<Food>(); 
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
    
    public void Bake()
    {
        Food test = new Food();
        for (int i = 0; i < test.getArray().size(); i++)
        {
            String yes = test.getArray().get(i).getCondition();
            if (yes == "Raw")
            {
                Current.add(test.getArray().get(i));
            }
        }
        BaketoString(Current);
        
    }
    private void BaketoString(ArrayList<Food> bake)
    {
        for (int i = 0; i < bake.size(); i++)
        {
            System.out.println(i + ". " + bake.get(i).getName());
        }
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