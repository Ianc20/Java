package corejava3;

public class DoubletoIntConv {
    public static void main(String[] args) {
        Double obj = new Double("23.98");
        int val =obj.intValue();
        System.out.println(val);
        float val2 =obj.floatValue();
        System.out.println(val2);
        double val3 =obj.doubleValue();
        System.out.println(val3);
    }
}
