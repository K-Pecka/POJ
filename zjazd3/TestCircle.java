package zjazd3;
public class TestCircle {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");

        // zad 3.1 b)
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        c1.Info("c1");
        c1.toString();
        c2.Info("c2");
        c2.toString();

        // zad 3.1 c)
        Circle c3 = new Circle(4, "green");
        c3.Info("c3");
        c3.toString();

        // zad 3.1 d)
        Circle c4 = new Circle();
        c4.setColor("yellow");
        c4.setRadius(7);
        c4.Info("c4");
        c4.toString();
    }
}
