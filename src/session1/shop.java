package session1;

import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Black Current: $5
        System.out.println("Please enter the amount of Black Current");
        int blackCurrent = scan.nextInt();
        double totalOfBlackCurrent = (blackCurrent * 5);
        System.out.println("Your subtotal of Black Current is " + totalOfBlackCurrent);
        //White Forest: $3
        System.out.println("Please enter the amount of White Forest");
        int whiteForest = scan.nextInt();
        double totalOfWhiteForest = (whiteForest * 3);
        System.out.println("Your subtotal of White Forest is " + totalOfWhiteForest);
        //Chocolate: $4
        System.out.println("Please enter the amount of Chocolate");
        int chocolate = scan.nextInt();
        double totalOfChocolate = (chocolate * 4);
        System.out.println("Your subtotal of Chocolate is " + totalOfChocolate);
        //Red Velvet: $4.5
        System.out.println("Please enter the amount of Red Velvet");
        int redVelvet = scan.nextInt();
        double totalOfRedVelvet = (redVelvet * 4.5);
        System.out.println("Your subtotal of Red Velvet is " + totalOfRedVelvet);
        
        double total = totalOfBlackCurrent + totalOfWhiteForest + totalOfChocolate + totalOfRedVelvet;

        System.out.println("Your total is " + total);

        scan.close();
        
    }
}
