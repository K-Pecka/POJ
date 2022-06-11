package zjazd6.zad6_3;
import java.util.*;
public class Tree {
    public static void main(String[] args) {
        System.out.println("\n========================================\n");
        TreeSet<String> tree1 = new TreeSet<String>();
        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");
        System.out.println("a) Drzewo zawierające pięć nazw kolorów:\ntree1: "+tree1+"\n");

        System.out.println("b) Iterowanie po wszystkich elementach drzewa:");
        Iterator<String> Iter = tree1.iterator();
        while(Iter.hasNext())
        {
            System.out.println(Iter.next());
        }
        TreeSet<String> tree2 = new TreeSet<String>();
        tree2.add("Black");
        tree2.add("Ping");
        tree2.add("White");

        System.out.println("\nc) Dodanie do istniejącego drzewa nowego drzewa binarnego\ntree1: "+tree1+"\ntree2: "+tree2);
        tree1.addAll(tree2);
        System.out.println("tree1 po zsumowaniu z tree2: "+tree1);

        System.out.println("\nd) Wpisywanie elementów drzewa w odwrotnej kolejności:\nOrginalne drzewo tree1: "+tree1+"\nOdwrotna kolejność:");
        Iterator<String> Iter2 = tree1.descendingIterator();
        while(Iter2.hasNext())
        {
            System.out.println(Iter2.next());
        }
        System.out.println("\ne) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie: "+tree1+"\nPierwszy element drzewa: "+tree1.first()+"\nOstatni element drzewa: "+tree1.last());

        TreeSet<String> tree3 = new TreeSet<String>(tree1);
        System.out.println("\nf) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego drzewa na ekran:\ntree1: "+tree1+"\nNowe drzewo tree3: "+tree3);

        System.out.println("\ng) Liczba elementów, przechowywanychw drzewie:\ntree1: "+tree1+"\nRozmiar tree1: "+tree1.size());
        System.out.println("\nh) Porównanie elementów przechowywanych w dwóch drzewach binanrych: ");
        Iterator<String> Iter3 = tree1.iterator();
        while(Iter3.hasNext())
        {
            String index = Iter3.next();
            String res = tree2.contains(index)?"TAK":"NIE";
            System.out.println("-Czy element <<"+index+">> w drzewie tree1 jest taki sam jak w tree2?\n"+res);
        }

    }
}
