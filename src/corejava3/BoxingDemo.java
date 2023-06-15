package corejava3;

public class BoxingDemo {
    public static void main(String[] args) {
        int num1 = 100;
        //convert primitive type int to Qrapper - Integer
        Integer integer = Integer.valueOf(num1);
        System.out.println("integer = " + integer);
        System.out.println("num1 = " + num1);
        //The process of encapsulating a value into an object is called boxing.
    }
}
