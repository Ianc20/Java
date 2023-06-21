package corejava5.Override190623;

public class OverrideMain {
    public static void main(String[] args) {
        Override override = new Override();
        override.i = 10;
        override.j = 20;
        System.out.println("sum: " + override.sum(override.i,override.j));
        OverrideSub overrideSub = new OverrideSub();
        System.out.println("subsum: " + overrideSub.sum(override.i,override.j));
    }
}
