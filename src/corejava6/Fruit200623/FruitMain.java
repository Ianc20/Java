package corejava6.Fruit200623;

public class FruitMain {
    public static void main(String[] args) {
        Fruit apple = new Apple(10, 20, "red");
        apple.color();
        System.out.println("the average weight of apple is: " + apple.avgWeight());

        Fruit mango = new Mango(10, 20, "yellow");
        mango.color();
        System.out.println("the average weight of mango is: "+ mango.avgWeight()); 

    }
}
