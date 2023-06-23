package corejava9.CaculatorEHTask230623;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorEHTask implements Calculator{

    static void caculator(Scanner sc){
        do{
            try {
                System.out.println("Enter num1: ");
                int num1 = sc.nextInt();
                System.out.println("Enter num2: ");
                int num2 = sc.nextInt();

                System.out.println("chose the operator +, -, *, /, %");
                String op = sc.next();

                Calculator.calculate(num1, num2, op);
            }catch (InputMismatchException e){
                System.out.println("Exception caught : " + e);
                sc.next();
            }
            catch (Exception e) {
                System.out.println("Exception caught : " + e);
            }
            System.out.println("Do you want to continue?(y/n) : ");

        }while(sc.next().equalsIgnoreCase("y"));
    }
}
