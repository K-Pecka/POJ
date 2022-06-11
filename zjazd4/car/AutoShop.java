package zjazd4.car;

public class AutoShop {
    public static void main(String[] args) {
        System.out.println("\n======================================================================\n");
        Sedan sedan = new Sedan(160,20000,"red",10);
        Ford ford_1 = new Ford(156,4452.0,"black",2005,10);
        Ford ford_2 = new Ford(155,5000.0,"pink",1998,5);
        Truck truck = new Truck(200,500000,"gold",5000);

        System.out.println(sedan.getPurchaseInfo()+"\n"+sedan.getInfo());
        System.out.println(ford_1.getPurchaseInfo()+"\n"+ford_1.getInfo());
        System.out.println(ford_2.getPurchaseInfo()+"\n"+ford_2.getInfo());
        System.out.println(truck.getPurchaseInfo()+"\n"+truck.getInfo());

        System.out.println(sedan.getPurchaseInfo()+sedan.getSalePrice());
        System.out.println(ford_1.getPurchaseInfo()+ford_1.getSalePrice());
        System.out.println(ford_2.getPurchaseInfo()+ford_2.getSalePrice());
        System.out.println(truck.getPurchaseInfo()+truck.getSalePrice());
        
    }
}