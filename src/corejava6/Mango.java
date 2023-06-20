package corejava6;

public class Mango extends Fruit {

    Mango() {
    }

    Mango(int totalWeight, int quantity, String color) {
        super(totalWeight, quantity, color);
    }

    @Override
    public double avgWeight() {
       return 8.5; 
    }

    @Override
    public void color() {
        System.out.println("Mango color is:" + this.color);
    }

    
}
