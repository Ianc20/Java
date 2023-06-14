package corejava2;

import java.util.Scanner;

public class WhileLoop1 {
    
    public static void main(String[] args) {
        //print 10 to 20
        /* int i = 10;
        while (i <= 20) {
            System.out.println(i);
            i++;
        } */

        //print 100 to 120 even numbers
        /* int i = 100;
        while (i <= 120) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } */
        //input 2 number get the mid point of them, use while loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();
        while (num1 <= num2/2) {
            num1++;
        }
        System.out.println(num1);
        scanner.close();
    }

}
