package corejava5.Overload190623;

import java.util.Scanner;

public class Overload {
    int num1 = 10,num2 = 20, sum;
    void sum(){
        sum = num1 + num2;
        System.out.println("sum1 is: "+ sum);
    }
    void sum(Scanner in){
        System.out.println("Enter number1: ");
        int a = in.nextInt();
        System.out.println("Enter number2: ");
        int b = in.nextInt();
        sum = a + b;
        System.out.println("sum2 is: "+ sum);
            
    }
}
