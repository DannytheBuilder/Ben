import java.util.ArrayList;
import java.util.Random;
public class Customer 
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> lastname = new ArrayList<String>();
    ArrayList<String> customer = new ArrayList<String>();
    ArrayList<String> fgreet = new ArrayList<String>();
    String fname = null;
    String lname = null;
    public Customer(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
        name();
        FGreetings();
    }

    public Customer()
    {
        name();
        FGreetings();
        String[] fullname = randomName().split(" ");
        this.fname = fullname[0];
        this.lname = fullname[1];
    }
    private void name()
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

        lastname.add("Keller");
        lastname.add("Smith");
        lastname.add("Koo");
        lastname.add("Jackson");
        lastname.add("Time");
        lastname.add("Kaiser");
        lastname.add("Yoichi");
        lastname.add("Jone");
        lastname.add("Li");
        lastname.add("Brookens");
        lastname.add("Baker");

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
        return fullname;
    }

    public void FGreetings()
    {
       fgreet.add("Hello! I like");
       fgreet.add("Excuse me? I like");
       fgreet.add("Excuse me? I want");
       fgreet.add("I like");
    }

    public String Greeting()
    {
        if (fgreet.isEmpty())
        {
            return "I like";
        }
        Random random = new Random();
        return fgreet.get(random.nextInt(fgreet.size()));
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public String getFullName() {
        return fname + " " + lname;
    }

    
    
}
