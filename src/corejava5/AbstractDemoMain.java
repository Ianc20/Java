package corejava5;

public interface AbstractDemoMain {
    public static void main(String[] args) {
        AbstractDemoSub demoSub = new AbstractDemoSub();
        demoSub.hello();
        demoSub.helloSub();
    }
}
