import java.util.ArrayList;
import java.util.Scanner;
public class Food {
    
    private String name = null;
    private String type = null;
    private int Spoilrate = 0;
    private String condition = null;
    ArrayList<Food> Current = new ArrayList<Food>();
    public Food(String name,String type, int spoilrate, String condition) 
    {
        
        this.name = name;
        this.type = type;
        this.Spoilrate = spoilrate;
        this.condition = condition;
        
    }

    public Food()
    {

    }

   
    // Order Functions 
    public void MainOrder()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Use Numbers To Order");
        System.out.println("What to Order?");
        System.out.println("1. Breads");
        int pick1 = input.nextInt();
        if (pick1 == 1)
        {
           BreadOrder(input);
            
        } else 
        {
            System.out.println("Invaild");
        }
            
    }

    private void BreadOrder(Scanner input)
    {
        System.out.println("\nBread Types:");
        System.out.println("1. PreBaked Breads");
        System.out.println("2. Raw Breads");
        System.out.println("Enter your choice: ");
        
        int breadType = input.nextInt();
        if (breadType == 1)
        {
            BasicBread(input);
        } else if (breadType == 2)
        {
            RawBread(input);
        }
    }

    private void BasicBread(Scanner input)
    {
        System.out.println("\nBasic Bread Options");
        System.out.println("1. Wheat Bread - 10$");
        System.out.println("2. Brown Bread - 10$" );
        System.out.println("3. MutiGrain Bread - 10$");
        int BasicBread = input.nextInt();
        if (BasicBread == 1)
        {
            System.out.println("Ordering Wheat Bread");
            Current.add(new Food("Bread", "Wheat", 10, "Cooked"));
        } else if (BasicBread == 2)
        {
            System.out.println("Ordering Brown Bread");
            Current.add(new Food("Bread", "Brown", 10, "Cooked"));
        } else if (BasicBread == 3)
        {
            System.out.println("Ordering MutiGrain Bread");
            Current.add(new Food("Bread", "MutiGrain", 10, "Cooked"));
        }
    }

    private void RawBread(Scanner input)
    {
        System.out.println("\nBasic Bread Options");
        System.out.println("1. Wheat Dough - 5$");
        System.out.println("2. Brown Dough - 5$" );
        System.out.println("3. MutiGrain Dough - 5$");
        int BasicBread = input.nextInt();
        if (BasicBread == 1)
        {
            System.out.println("Ordering Wheat Dough");
            Current.add(new Food("Bread", "Wheat", 10, "Raw"));
        } else if (BasicBread == 2)
        {
            System.out.println("Ordering Brown Dough");
            Current.add(new Food("Bread", "Brown", 10, "Raw"));
        } else if (BasicBread == 3)
        {
            System.out.println("Ordering MutiGrain Dough");
            Current.add(new Food("Bread", "MutiGrain", 10, "Raw"));
        }
    }

    //getter method sections
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSpoilrate()
    {
        return Spoilrate;
    }

    public String getCondition()
    {
        return condition;
    }
    
    public ArrayList<Food> getArray()
    {
        return Current;
    }
    //setter methods
    public void setFood(String food)
    {
        this.name = food;
    }

    public void setType(String Type)
    {
        this.type = Type;
    }

    public void setSpoilrate(int Spoils)
    {
        Spoilrate = Spoils;
    }

    public void setCondition(String con)
    {
        condition = con;
    }
}

