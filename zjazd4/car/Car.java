package zjazd4.car;

public class Car {
    public int speed;
    public double regularPrice;
    public String color;
    Car(int speed,double regularPrice,String color)
    {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
    public String getBasicInfo()
    {
        return "- speed = "+this.speed+";\n- regularPrice = "+this.regularPrice+";\n- color = "+this.color+";";
    }
    public double getSalePrice()
    {
        return this.regularPrice;
    }
}
