package corejava6.Fruit200623;

public class Apple extends Fruit {

    public Apple() {
    }

    public Apple(int totalWeight, int quantity, String color) {
        super(totalWeight, quantity, color); 
    }

    @Override
    public double avgWeight() {
        return 10.5;
    }

    @Override
    public void color() {
        System.out.println("Apple color is:" + this.color);
    }
    
    
}
