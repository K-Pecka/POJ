package zjazd3;
public class Circle {
    protected double radius;
    private String color;

    public Circle(double radius, String color) { // #3
        this.color = color;
        this.radius = radius;
    }

    public Circle() { // #1
        this(1, "red");
    }

    public Circle(double radius) { // #2
        this(radius, "red");
    }

    public double getRadius() {
        return this.radius;
    };

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // zad 3.1 d)
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Info(String name) {
        System.out.println("The circle " + name + " has radius " + this.getRadius() + " and area of " + this.getArea()
                + " and color of " + this.color);
    }

    // zad 3.1 e)
    public String toString() {
        // return "Circle: radius = " + this.getRadius() + ", color: " + this.color;
        System.out.println("Circle: radius = " + this.getArea() + ", color: " + this.color);
        return "";
    }
}
