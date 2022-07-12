package Vehicles;

public class Run {
    public static void main(String[] args) {
        Car balkan5 = new Car(100, 15);
        int track = 240;

        System.out.println(balkan5.toString());

        while(balkan5.fuel >= 0 && track >= 0){
            balkan5.Drive(track);
            balkan5.SetFuel(balkan5.GetFuel()-balkan5.GetFuelConsumption());
            track-=balkan5.GetHorsePower();
        }
    }
}
