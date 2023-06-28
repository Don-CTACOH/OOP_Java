package OOP_Java.HW6.Zadanie_2;

public class Car {
    public double calculateAllowedSpeed(Vehicle vehicle) {
       return vehicle.getMaxSpeed() * 0.8;
    }
}
