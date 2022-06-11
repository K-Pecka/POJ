package zjazd6.zad6_2;
import java.util.*;
public class HashSet_demo {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        HashSet<String> Hset = new HashSet<String>();
        Hset.add("Red");
        Hset.add("Green");
        Hset.add("Black");
        Hset.add("Pink");
        Hset.add("Orange");
        System.out.println("HashSet: "+Hset);
        System.out.println("HashSet to Array: ");
        Object[] HashSet_toArray =Hset.toArray();
        for(Object Intr : HashSet_toArray)
        {
            System.out.println(Intr);
        }
    }
    

}
