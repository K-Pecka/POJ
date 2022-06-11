package zjazd6.zad6_1;

import java.util.*;

public class LindedList {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        LinkedList<String> List = new LinkedList<String>();
        List.add("Red");
        List.add("Green");
        List.add("Black");
        List.add("Pink");
        List.add("Orange");
        System.out.println("The Orginal linked list: "+List);
        System.out.println("Element removed: "+List.removeFirst());
        System.out.println("Element removed: "+List.removeLast());
        System.out.println("The New linked list: "+List);
    }
}
