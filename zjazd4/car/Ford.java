package zjazd4.car;

public class Ford extends Car implements Purchase{
    public int year;
    public int manufacturerDiscount;
    Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
    {
        super(speed, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }
    public double getSalePrice()
    {
        return super.regularPrice-this.manufacturerDiscount;
    }
    public String getInfo()
    {
        return super.getBasicInfo()+"\n- year = "+this.year+";\n- manufacturerDiscount = "+this.manufacturerDiscount+";";
    }
    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
