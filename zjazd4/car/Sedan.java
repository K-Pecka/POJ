package zjazd4.car;

public class Sedan extends Car implements Purchase{
    public int length;
    Sedan(int speed,double regularPrice,String color,int length)
    {
        super(speed, regularPrice, color);
        this.length=length;
    }
    public double getSalePrice()
    {
        return (1-(this.length>20?0.05:0.10))*this.regularPrice;
    }
    public String getInfo()
    {
        return super.getBasicInfo()+"\n- length = "+this.length+";";
    }
    @Override
    public String getPurchaseInfo() {
        return "SEDAN";
    }
}
