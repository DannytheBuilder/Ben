import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Customer 
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> lastname = new ArrayList<String>();
    ArrayList<String> id = new ArrayList<String>();
    ArrayList<Customer> customer = new ArrayList<Customer>();
    ArrayList<String> Cust = new ArrayList<String>();
    ArrayList<String> fgreet = new ArrayList<String>();
    ArrayList<String> Order = new ArrayList<String>();
    ArrayList<String> want = new ArrayList<String>();
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
        add();
    }

    public Customer()
    {
        name();
        id();
        FGreetings();
        add();
        String[] fullname = randomName().split(" ");
        this.fname = fullname[0];
        this.lname = fullname[1];
    }

    private void add()
    {
        Cust.add("Brown");
        Cust.add("White");
        Cust.add("MutiGrain");
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

    private void FGreetings()
    {
       fgreet.add("Hello! I like");
       fgreet.add("Excuse me? I like");
       fgreet.add("Excuse me? I want");
       fgreet.add("I like");
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
        return fullname;
    }

  


    public void Order()
    {
        Random random = new Random();
        String order = fgreet.get(random.nextInt(fgreet.size()));
        String name = randomName();
        String food = Cust.get(random.nextInt(Cust.size()));
        
        String ordering = name + ": " + order + " " + food + " Bread";
        System.out.println(ordering);
        Order.add(ordering + " " + ids);
    }

    public void Feed()
    {
        Food get = new Food();
        Scanner input = new Scanner(System.in);
        ArrayList<Food> gets = get.getCookedArray();
        System.out.println("Pick Which Food To Feed Customer");
        for (int i = 0; i < gets.size(); i++)
        {
            System.out.println(i + ". " + gets.get(i).getType() + " " + gets.get(i).getName());
        }
        int number = input.nextInt();
        if (number + 1 < gets.size())
        {
            System.out.println("Invaild");
        } else 
        {
            System.out.println("Feeding Customer...");

        }
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