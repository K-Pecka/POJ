package zjazd4.cylinder;
public class Cylinder extends Circle{
    private double height;
    Cylinder(double radius, double height)
    {
        this.radius=radius;
        this.height=height;
    }
    Cylinder(double radius)
    {
        this(radius,4);
    }
    Cylinder()
    {
        this(1,4);
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getValue()
    {
        return this.getHeight()*this.getArea();
    }
}
