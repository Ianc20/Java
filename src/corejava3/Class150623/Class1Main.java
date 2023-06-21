package corejava3.Class150623;

import java.util.Scanner;

public class Class1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int a = sc.nextInt();
        System.out.println("Enter a number2:");
        int b = sc.nextInt();
        System.out.println("Enter a number3:");
        int c = sc.nextInt();
        Class1 c1 = new Class1(a,b,c);
        System.out.println(c1.slove1());
        sc.close();    
    }
}
