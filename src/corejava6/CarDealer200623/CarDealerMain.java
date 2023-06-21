package corejava6.CarDealer200623;

import java.util.Scanner;

public class CarDealerMain {
    public static void main(String[] args) {

        CarDealer person1 = new CarDealer("person1");
        CarDealer person2 = new CarDealer("person2");
        CarDealer person3 = new CarDealer("person3");

        CarModelSold.sold();
        Scanner scanner = new Scanner(System.in);

        person1.sales(scanner);
        person2.sales(scanner);
        person3.sales(scanner);
        
        scanner.close();
    }
}
