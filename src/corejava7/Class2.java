package corejava7;

public class Class2 implements Third{

    @Override
    public void second() {
        System.out.println("This is from Interface second");
    }

    @Override
    public void first() {
        System.out.println("This is from Interface first");
    }

    @Override
    public void third() {
        System.out.println("This is from Interface third");
    }
    
}
