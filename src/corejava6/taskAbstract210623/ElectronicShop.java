package corejava6.taskAbstract210623;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class ElectronicShop {
    static int giftCardBalance = 500;
    static int totalBill = 0;
    static Map<String, Integer> order = new HashMap<>();
    static Map<String, Integer> price = new HashMap<>();

    static void buyProduct(String item, int price){
        order.put(item, order.getOrDefault(item, 0) + 1);
        totalBill = totalBill + price;
    }

    abstract void buy(Scanner scanner);

    static int chatBot(Scanner scanner){
        System.out.println("Please enter the type of product you would like to buy:");
        System.out.println("1. Laptop");
        System.out.println("2. Accessories");
        System.out.println("3. Others");
        int choice = scanner.nextInt();
        return choice;
    }

    static void showBill(){
        int index = 1;
        System.out.println("NO\t|\titem\t\t|\tqty\t|\tprice");
        for (String item : order.keySet()) {
            System.out.println(index + ".\t|\t" + item + "\t|\t" + order.get(item) + "\t|\t" + price.get(item));
            index++;
        }
        System.out.println("Total bill: " + totalBill);
        if(totalBill < giftCardBalance){
            giftCardBalance -= totalBill;
            System.out.println("Your gift card balance left: " + giftCardBalance);
        }else if(totalBill > giftCardBalance){
            totalBill -= giftCardBalance;
            System.out.println("Your payment is: " + totalBill);
        }else{
            System.out.println("Your gift card is exhausted.");
        }
    }
}
