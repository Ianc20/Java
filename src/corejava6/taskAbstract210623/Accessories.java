package corejava6.taskAbstract210623;

import java.util.Scanner;

public class Accessories extends ElectronicShop {
    final static String[] ACCESSORIES = {"Headphone", "Headset\t", "Mouse\t", "Keyboard", "Mousepad"};
    final static int[] ACCESSORIESPRICE = {50,30,20,10,10};
    @Override
    void buy(Scanner scanner) {
        System.out.println("Welcome to our accessories shop! Please enter the number of accessories you would like to buy:");
        System.out.println("1. Headphone");
        System.out.println("2. Headset");
        System.out.println("3. Mouse");
        System.out.println("4. Keyboard");
        System.out.println("5. Mousepad");
        int choice = scanner.nextInt();
        String item = ACCESSORIES[choice - 1];
        int price = ACCESSORIESPRICE[choice - 1];
        buyProduct(item, price);
        ElectronicShop.price.put(item, price); 
    }

    
}
