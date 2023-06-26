package corejava10.CloneTask;

public class Car implements Cloneable {
    String carMake;
    float carSpeed;
    /**
     * @param carMake
     * @param carSpeed
     */
    public Car(String carMake, float carSpeed) {
        this.carMake = carMake;
        this.carSpeed = carSpeed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
}
