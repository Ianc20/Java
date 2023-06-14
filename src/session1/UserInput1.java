package session1;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        
        System.out.println("Your name is " + name + ", Your age is " + age + ", Your height is " + height + " cm");

        scanner.close();

    }
}
