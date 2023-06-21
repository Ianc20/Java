package corejava6.TaskAbstract210623;

import java.util.Scanner;

public class Others extends ElectronicShop {
    final static String[] OTHERS = {"USB\t","Battery\t","Projector","Connector","Monitor"};
    final static int[] OTHERS_PRICE = {20,50,60,80,100};

    @Override
    void buy(Scanner scanner) {
        System.out.println("Welcome to our others shop! Please enter the number of brands you would like to buy:");
        System.out.println("1. USB");
        System.out.println("2. Battery");
        System.out.println("3. Projector");
        System.out.println("4. Connector");
        System.out.println("5. Monitor");
        int choice = scanner.nextInt();
        String item = OTHERS[choice - 1];
        int price = OTHERS_PRICE[choice - 1];
        buyProduct(item, price);
        ElectronicShop.price.put(item, price); 
    }
    
    
}
