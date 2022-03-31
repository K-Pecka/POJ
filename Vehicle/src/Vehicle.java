public class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    public Vehicle(int passengers, int fuelcap, double lkm) { //    constructor with parameters: number of passengers,tank capacity and l/km.
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }
    public double range() { return round2Decimals((fuelcap / lkm) * 100);} //   A method that returns the maximum range of the vehicle with a full fuel tank.
   
    public int getPassengers() {return this.passengers;}   //   GET/SET
    public int getFuelcap() {return this.fuelcap;}
    public double getLkm() {return this.lkm;}

    public void setPassengers(int passengers) { this.passengers = passengers;}
    public void setFuelcap(int fuelcap) { this.fuelcap = fuelcap;}
    public void setLkm(double lkm) { this.lkm = lkm;}
    
    
    public double driveKm(double dkm){ return round2Decimals((dkm/100)*lkm); }  //  A method that calculates how much fuel is needed to travel the distance entered.
    public double round2Decimals(double no){return (Math.round(no*100.0))/100.0;} // A method rounding a number to 2 decimal places.
}