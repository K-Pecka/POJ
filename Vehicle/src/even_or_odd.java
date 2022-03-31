import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] arg) {
        System.out.println("\n======================================================================\n");
        System.out.println("ZAD 2.14");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Podaj dowolną liczbę:");
                Double no = scanner.nextDouble();
                System.out.print(no + " jest ");
                if (!even(no)) {
                    System.out.print("nie");
                }
                System.out.println("przarzysta");
            }
        } catch (Exception e) {
        }
    }

    public static boolean even(Double no) {
        return no % 2 == 0;
    } // Function that checks if a given number is even .
}
