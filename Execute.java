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
        
        System.out.println(testing);
        System.out.println(Name.randomName());
        System.out.println(Name.randomName());
        tests.MainOrder();
        tests.MainOrder();
        testing.Bake();
        
    }
    
}
