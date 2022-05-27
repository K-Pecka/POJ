package zjazd4.car;

public class Truck extends Car implements Purchase{
    public int weight;

    Truck(int speed,double regularPrice,String color,int weight)
    {
        super(speed, regularPrice, color);
        this.weight=weight;
    }
    public double getSalePrice()
    {
        return (1-(this.weight>2000?0.1:0))*this.regularPrice;
    }
    public String getInfo()
    {
        return super.getBasicInfo()+"\n- weight = "+this.weight+";";
    }
    @Override
    public String getPurchaseInfo() {
        return "TRUCK";
    }
}
