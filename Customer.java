import java.util.ArrayList;
import java.util.Random;
public class Customer 
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> lastname = new ArrayList<String>();
    ArrayList<String> id = new ArrayList<String>();
    ArrayList<Customer> customer = new ArrayList<Customer>();
    ArrayList<String> fgreet = new ArrayList<String>();
    String ids = "";
    String fname = null;
    String lname = null;
    public Customer(String fname, String lname, String id)
    {
        this.fname = fname;
        this.lname = lname;
        id = ids;
        name();
        id();
        FGreetings();
        
    }

    public Customer()
    {
        name();
        id();
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

    private void id()
    {
        id.add("a");
        id.add("b");
        id.add("c");
        id.add("d");
        id.add("e");
        id.add("f");
        id.add("g");
        id.add("h");
        id.add("i");
        id.add("j");
        id.add("k");
        id.add("l");
        id.add("o");
        id.add("m");
    }

    

    public String randomName()
    {
        Random random = new Random();
        int zero = 0;   
        String randomid = id.get(random.nextInt(id.size()));
        if (name == null || lastname == null || customer == null || name.isEmpty() || lastname.isEmpty())
        {
            return "Unknown Customer";
        }
        String randomName = name.get(random.nextInt(name.size()));
        String randomLastName = lastname.get(random.nextInt(lastname.size()));
        
        
        while(zero < 2)
        {
        String idse = id.get(random.nextInt(id.size()));
        randomid = randomid + idse;
        zero++;
        }
        String fullname = randomName + " " + randomLastName;
        
        Customer cust = new Customer(randomName, randomLastName, randomid);
        customer.add(cust);
        return fullname + " "+ randomid;
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

    public String getid()
    {
        return ids;
    }

    public ArrayList<Customer> getCustomer()
    {
        return customer;
    }
    
}