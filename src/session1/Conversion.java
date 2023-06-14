package session1;

public class Conversion {
    public static void main(String[] args) {
        byte by1; // by1 is of 1 byte
        int in1 = 255; // in1 is of 4 bytes
        by1 = (byte) in1;
        System.out.println("by1 : " + by1);

        double db1 = 323.142; // db1 is of 8 bytes
        in1 = (int) db1;
        System.out.println("in1 : " + in1);

        by1 = (byte) db1;
        System.out.println("by1 from db1 : " + by1);

        //ex: int to double, double to int, double to byte, byte to double
        int in2 = 255;
        double db2 = in2;
        System.out.println("in : " + in2);
        System.out.println("db2 : " + db2);
        int by2 = (int) db2;
        System.out.println("by2 : " + by2);
        byte by3 = (byte) by2;
        System.out.println("by3 : " + by3);
        double db3 = by3;
        System.out.println("db3 : " + db3);


    }
}
