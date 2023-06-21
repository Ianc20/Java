package corejava5.AbstractDemo190623;

public interface AbstractDemoMain {
    public static void main(String[] args) {
        AbstractDemoSub demoSub = new AbstractDemoSub();
        demoSub.hello();
        demoSub.helloSub();
    }
}
