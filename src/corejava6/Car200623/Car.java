package corejava6.Car200623;

public abstract class Car {
    String color;
    double topSpeed;
    String type;
    boolean convertible;

    public Car() {
    }
    public Car(String type) {
        this.type = type;
    }

    public Car(String color, double topSpeed, String type, boolean convertible) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.type = type;
        this.convertible = convertible;
    }

    abstract void features();
    
}
