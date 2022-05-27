package zjazd4.cylinder;
public class TestCircleAndCylinder {
    public static void main(String[] args) {
        System.out.println("\n======================================================================\n");
        Circle circle_1 = new Circle();
        Circle circle_2 = new Circle(3.5);
        System.out.println("Radius: "+circle_1.getRadius());
        System.out.println("Area: "+circle_1.getArea());
        circle_1.toString();
        circle_2.toString();
       
        Cylinder cylinder_1 = new Cylinder(5,6);
        Cylinder cylinder_2 = new Cylinder(8);
        Cylinder cylinder_3 = new Cylinder();
        System.out.println("\nRadius cylinder 1: "+cylinder_1.getRadius());
        System.out.println("Hegiht cylinder 1: "+cylinder_1.getHeight()+"\n");
        System.out.println("Value cylinder 1: "+cylinder_1.getValue());
        System.out.println("Value cylinder 2: "+cylinder_2.getValue());
        System.out.println("Value cylinder 3: "+cylinder_3.getValue());
    }
}
