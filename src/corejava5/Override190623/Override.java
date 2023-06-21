package corejava5.Override190623;

import java.util.Scanner;

public class Override {
    int i,j,sum;
    int sum(int i,int j){
        sum = i + j;
        return sum;
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
