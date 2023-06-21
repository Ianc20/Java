package corejava6.TaskAbstract210623;

import java.util.Scanner;

public class Laptops extends ElectronicShop {
    final static String[] MACBOOKS = {"MacBook_Pro", "MacBook_Air", "MacBook\t"};
    final static String[] HP = {"HP_Envy\t", "HP_Pavilion", "HP_Spectre"};
    final static String[] CHEAP = {"X1\t", "X2\t", "X3\t"};
    final static String[][] LAPTOP = {MACBOOKS, HP, CHEAP};
    final static int[][] LAPTOPPRICE = {{700,800,900}, {600,500,400}, {100,200,300}};


    void printMenu(int choice) {
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
        String item = LAPTOP[brands-1][choice - 1];
        int price = LAPTOPPRICE[brands-1][choice - 1];
        buyProduct(item, price);
        ElectronicShop.price.put(item, price);       
    }
    

}
