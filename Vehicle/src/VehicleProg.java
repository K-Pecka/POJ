
public class VehicleProg {
    public static void main(String[] args){
        Vehicle miniVan = new Vehicle(7,64,10);         //A new object with the following parameters: passengers, fuelcap and lkm(l/km)
        Vehicle sportsCar = new Vehicle(2,85,15);
        System.out.println("\n======================================================================\n");
        
        System.out.println("ZAD 2.11,13");
        System.out.println("Minivan przewozi "+miniVan.getPassengers()+" osób na odległość do "+miniVan.range()+" kilometrów.");
        System.out.println("Auto sportowe przewozi "+sportsCar.getPassengers()+" osób na odległość do "+sportsCar.range()+" kilometrów.");

        System.out.println("\nZAD 2.12");
        System.out.println("Minivan przewozi "+miniVan.getPassengers()+" osób.\nZasięg (km): "+miniVan.range());
        System.out.println("Auto sportowe przewozi "+sportsCar.getPassengers()+" osób.\nZasięg (km): "+sportsCar.range());

        System.out.println("\nZAD 2.15");
        System.out.println("Minivan potrzebuje "+miniVan.driveKm(561)+" litrów paliwa.");
        System.out.println("Auto sportowe potrzebuje "+sportsCar.driveKm(471)+" litrów paliwa.");
        
        System.out.println("\n======================================================================");
    }
}
