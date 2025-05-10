import java.util.Scanner;
public class Execute 
{
    
    
    public static void main(String[] args)
    {
        Customer Name = new Customer();
        Food tests = new Food();
        Scanner test = new Scanner(System.in);
        System.out.println("What is Your Bakery Name?");
        String bakename = test.nextLine();
        Bakery testing = new Bakery(bakename);
        Spoil check = new Spoil();

        System.out.println(testing);
        System.out.println("Welcome To The Bakery!");
        System.out.println("First we will give you a test run of a customer for our testing phase.");
        Name.Order();
        while(true)
        {
            check.SpoilCheck();
            System.out.println("1: Order");
            System.out.println("2: Bake");
            System.out.println("3: Feed");
            int pick = test.nextInt();
            if (pick == 1)
            {
              tests.MainOrder();
            } else if (pick ==2)
            {
                tests.Bake();
                tests.BaketoString();
            }
            else if (pick ==3)
            {
                Name.Feed();
            } else 
            {
                System.out.println("Invaild");
            }
        }
    }
    
}