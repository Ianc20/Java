package corejava6.TaskAbstract210623;

import java.util.Scanner;

public class ElectronicShopMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Electronic Shop");
        do {
            int choice = ElectronicShop.chatBot(scanner);
            switch (choice) {
                case 1:
                    ElectronicShop eShop = new Laptops();
                    eShop.buy(scanner);
                    break;
                case 2:
                    ElectronicShop eShop1 = new Accessories();
                    eShop1.buy(scanner);
                    break;
                case 3:
                    ElectronicShop eShop2 = new Others();
                    eShop2.buy(scanner);
                    break;
            }
            
            System.out.println("Would you like to continue? (y/n)");
            scanner.nextLine();
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();

        ElectronicShop.showBill();

    
    }
    
}
