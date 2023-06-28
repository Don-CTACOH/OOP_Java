package OOP_Java.HW6.Zadanie_3;

public class Circle implements CalculatingArea {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
