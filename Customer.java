import java.util.ArrayList;
import java.util.Random;
public class Customer 
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> lastname = new ArrayList<String>();
    ArrayList<String> customer = new ArrayList<String>();
    String fname = null;
    String lname = null;
    public Customer(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }
    public void Firstname()
    {
        name.add("Maxwell");
        name.add("Josh");
        name.add("Micheal");
        name.add("Isagi");
        name.add("Fredrik");
        name.add("Boner");
        name.add("James");
        name.add("Bob");
        name.add("Diddy");
        name.add("Miguel");
    }

    public void Lastname()
    {
        lastname.add("Keller");
        lastname.add("Smith");
        lastname.add("Koo");
        lastname.add("Jackson");
        lastname.add("Time");
        lastname.add("Kaiser");
        lastname.add("Yoichi");
        lastname.add("Jone");
        lastname.add("Li");

    }

    public String randomName()
    {
        if (name == null || lastname == null || customer == null || name.isEmpty() || lastname.isEmpty())
        {
            return "Unknown Customer";
        }
        Random random = new Random();
        String randomName = name.get(random.nextInt(name.size()));
        String randomLastName = lastname.get(random.nextInt(lastname.size()));
        String fullname = randomName + " " + randomLastName;
        customer.add(fullname);
        Customer(randomName, randomLastName);
        return fullname;
    }
}
