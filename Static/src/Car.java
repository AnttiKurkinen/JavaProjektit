public class Car {
    private static int carCount = 0;
    private static double totalFuelCost = 0;
    public static double fuelPrice = 1.929;

    private double fuelPer100;
    private double distance;

    public Car(double consumption){
        this.fuelPer100 = consumption;
        carCount++;
    }

    public void DriveDistance(double distance){
        totalFuelCost += distance * this.fuelPer100/100 * fuelPrice;
        this.distance += distance;
    }
}
