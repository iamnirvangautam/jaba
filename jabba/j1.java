package jabba;
import java.util.*;
class cars
{
    String name;
    cars next;
}
public class j1 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        j1 obj = new j1();
        cars c1 = new cars();
        cars c2 = new cars();
        cars c3 = new cars();
        System.out.println("enter name of three cars");
        c1.name = keyboard.nextLine();
        c2.name = keyboard.nextLine();
        c3.name = keyboard.nextLine();
        c1.next = c2;
        c2.next = c3;
        c3.next = null;
        obj.display(c1);
    }
    void display(cars head)
    {
        cars h=head;
        while(h!=null)
        {
            System.out.println(h.name);
            h=h.next;
        }
    }
}
