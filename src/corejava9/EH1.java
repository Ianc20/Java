package corejava9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();
            int divide = num1 / num2;
            System.out.println( num1 + " / " + num2  + " = " + divide);
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Exception caught : " + e);
        }catch(InputMismatchException e2){
            //e2.printStackTrace();
            System.out.println("Exception caught : " + e2);
        }
        System.out.println("After Exception is caught...");
        sc.close();
        
    }
}
