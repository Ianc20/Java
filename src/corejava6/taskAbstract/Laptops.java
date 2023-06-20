package corejava6.taskAbstract;

import java.util.Scanner;

public class Laptops extends ElectronicShop {
    final static String[] MACBOOKS = {"MacBook Pro,1100", "MacBook Air,950", "MacBook,800"};
    final static String[] HP = {"HP Envy,1000", "HP Pavilion,900", "HP Spectre,700"};
    final static String[] CHEAP = {"X1,100", "X2,200", "X3,300"};
    final static String[][] LAPTOP = {MACBOOKS, HP, CHEAP};


    static void printMenu(int choice) {
        int index = 1;
        switch (choice) {
            case 1:
                for (String string : MACBOOKS) {
                    System.out.println(index + ". " + string);
                    index++;
                }
                break;
            case 2:
                for (String string : HP) {
                    System.out.println(index + ". " + string);
                    index++;
                }
                break;
            case 3:
                for (String string : CHEAP) {
                    System.out.println(index + ". " + string);
                    index++;
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    void buy(Scanner scanner) {
        System.out.println("Welcome to our laptops shop! Please enter the number of brands you would like to buy:");
        System.out.println("1. MacBooks");
        System.out.println("2. HP");
        System.out.println("3. Cheap");
        int brands = scanner.nextInt();
        printMenu(brands);
        int choice = scanner.nextInt();
        String[] theOrder;
        
                
    }

    void putToShoppingCart(int brands, int choice) {
        
        
    }

}
