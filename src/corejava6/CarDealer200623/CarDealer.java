package corejava6.CarDealer200623;

import java.util.Scanner;

public class CarDealer extends CarModelSold{
    String name;
    public CarDealer() {
    }
    public CarDealer(String name) {
        this.name = name;
    }
    public void sales(Scanner scanner) {
        System.out.println("Enter the number of model x1 sold by " + name + " today");
        int x1Today = scanner.nextInt();
        this.x1sale(x1Today);
        System.out.println("Enter the number of model x2 sold by " + name + " today");
        int x2Today = scanner.nextInt();
        this.x2sale(x2Today);
        System.out.println("Enter the number of model x3 sold by " + name + " today");
        int x3Today = scanner.nextInt();
        this.x3sale(x3Today);
        CarModelSold.sold();
    }
    
    void x1sale(int sold) {
        CarModelSold.x1Today += sold;
    }
    void x2sale(int sold) {
        CarModelSold.x2Today += sold;
    }
    void x3sale(int sold) {
        CarModelSold.x3Today += sold;
    } 

}
