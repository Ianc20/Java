package corejava5.StaticDemo190623;

public class StaticDemoMain {
    public static void main(String[] args) {
        StaticDemo.displayNum1();
        System.out.println("num2: " + StaticDemo.num2);
        StaticDemo demo = new StaticDemo();
        demo.sum();
    }
}
