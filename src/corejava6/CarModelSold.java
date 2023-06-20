package corejava6;

public class CarModelSold {
    static int x1Today = 0;
    static int x2Today = 0;
    static int x3Today = 0;
    static int x1Month = 90;
    static int x2Month = 80;
    static int x3Month = 120;

    final static void sold() {
        System.out.println("Sold:");
        System.out.println("Model x1 Today Sales: " + x1Today +",\tModel x1 Month Sales: " + (x1Today + x1Month));
        System.out.println("Model x2 Today Sales: " + x2Today + ",\tModel x2 Month Sales: " + (x2Today + x2Month));
        System.out.println("Model x3 Today Sales: " + x3Today + ",\tModel x3 Month Sales: "+ (x3Today + x3Month));
    } 

    
}
