package corejava5.StaticDemo190623;

public class StaticDemo {
    static int num1 = 100;
    static int num2 = 200;

    static void displayNum1(){
        System.out.println("num1: " + num1);
    }

    static {
        System.out.println("static block");
        System.out.println("Product: " + num1 * num2);
    }

    void sum(){
        System.out.println("Sum: " + (num1 + num2));
    }
}
