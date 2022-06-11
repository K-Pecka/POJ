package zjazd6.zad6_4;

import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        System.out.println("\n========================================\n");
        HashMap<Integer, String> month_name = new HashMap<Integer, String>();
        month_name.put(1, "January");
        month_name.put(2, "February");
        month_name.put(3, "March");
        month_name.put(4, "April");
        month_name.put(5, "May");
        month_name.put(6, "June");
        month_name.put(7, "July");
        month_name.put(8, "August");
        month_name.put(9, "September");
        month_name.put(10, "October");
        month_name.put(11, "November");
        month_name.put(12, "December");

        
        System.out.println("Enter any number from 1 to 12:");
        //int choose = read_int();
        int choose = 0;
        boolean isValid = false;
        while(!isValid) 
        {
            try {
                choose = new Scanner(System.in).nextInt();
                if(choose<=12 && choose>=1)
                {
                    isValid = true;
                }
                else
                {
                    System.err.println("number out of range!");
                }
            } catch (InputMismatchException e) {
                System.err.println("This is not number!");
            }
        }
        System.out.println(choose);
        System.out.println(
                "Tou choose: " + choose + "\nThis is " + month_name.get(choose) + "\nAll months: " + month_name);
    }
}
