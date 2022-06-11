package zjazd5.zad5_1;

import java.util.*;

public class ArrayList_demo {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        List<Integer> list = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 2; list.size()<50; i+=2) {
                list.add(i);
        }
        System.out.println(list);
        for (int i=0;i<50;i++){
            System.out.println(i+": "+list.get(i));
        }
        long stop=System.currentTimeMillis();
        System.out.println("Time: "+(stop-start));

    }
}
