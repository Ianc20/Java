package corejava6.Fruit200623;

public abstract class Fruit {

    int totalWeight;
    int quantity;
    String color;

    public Fruit(){}
    public Fruit(int totalWeight, int quantity, String color){
        this.totalWeight = totalWeight;
        this.quantity = quantity;
        this.color = color;
    }
    
    public abstract double avgWeight(); 
    public abstract void color();

}
