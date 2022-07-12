package Vehicles;

public class Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    public double fuelConsumption;
    public double fuel;
    public int horsePower;

    public Vehicle(double fuel, int horsePower) {
        super();
        this.fuelConsumption = GetFuelConsumption();
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public double GetFuelConsumption() {
        return this.DEFAULT_FUEL_CONSUMPTION;
    }

    public void SetFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double GetFuel() {
        return fuel;
    }

    public void SetFuel(double fuel) {
        this.fuel = fuel;
    }

    public int GetHorsePower() {
        return horsePower;
    }

    public void SetHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "fuelConsumption=" + fuelConsumption +
                ", fuel=" + fuel +
                ", horsePower=" + horsePower +
                '}';
    }

    public void Drive(int km) {
        System.out.println(km + "km left, and " + fuel + " fuel left.");
    }
}
