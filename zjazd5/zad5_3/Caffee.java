package zjazd5.zad5_3;
import java.util.*;;
public class Caffee {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        List<String> caffee = new ArrayList<String>();
        caffee.add("espresso");
        caffee.add("latte");
        caffee.add("cappuccino");
        caffee.add("mocha");
        caffee.add("auLait");
        caffee.add("macchiato");
        System.out.println(caffee);
        Iterator<String>Inter = caffee.iterator();
        while(Inter.hasNext())
        {
            System.out.println(Inter.next());
        }
        for(String c:caffee)
        {
            System.out.println(c.toUpperCase());
        }
        for(int i=0;i<caffee.size();i++)
        {
            System.out.println(caffee.get(i).substring(0, 4));
        }
    }
}
