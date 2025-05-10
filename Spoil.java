public class Spoil extends Food
{
    private boolean Spoiled = false;
    private int Spoilmeter = 0;
    public Spoil(String name,String type, int spoilrate, boolean Spoiled, String condition, int Spoilmeter)
    {
        super(name, type, spoilrate, condition);
        this.Spoiled = Spoiled;
        this.Spoilmeter = Spoilmeter;
    }

    public Spoil(){
        
    }

    public void Spoiling()
    {
        int rate = getSpoilrate();
        rate += Spoilmeter;
    }
    public void Spoilcheck()
    {
        if(Spoilmeter >= 100)
        {
            Spoiled = true;
        }
    }

    public void SpoilCheck()
    {
        if (Spoiled)
        {
            setCondition("Spoiled");
        }
    }
    public void Ratecheck()
    {
        int rate = getSpoilrate();
        if (rate > 10)
        {
            rate = 10;
        }
    }
    public boolean getSpoiled()
    {
        return Spoiled;
    }
    
    public int getMeter()
    {
        return Spoilmeter;
    }
}