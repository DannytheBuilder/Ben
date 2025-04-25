public class Food {

    private String name = null;
    private String type = null;
    private int Spoilrate = 0;
    private String condition = null;
    private int Cookrate = 0;
    public Food(String name,String type, int spoilrate, String condition, int Cookrate) 
    {
        this.name = name;
        this.type = type;
        this.Spoilrate = spoilrate;
        this.condition = condition;
        this.Cookrate = Cookrate;
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
    
    public int getCookrate()
    {
        return Cookrate;
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
