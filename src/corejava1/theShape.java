package corejava1;

import java.util.Scanner;

public class theShape {
    // a switch statement for square and rectangle
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Photo frame side1:");
        double side1 = in.nextInt();
        System.out.println("Enter length of Photo frame side2:");
        double side2 = in.nextInt();
        if (side1 == side2) {
            System.out.println("Square");
            //System.out.println("Square：" + side1+", " + side2+", " + side1+", " + side2);
        } else {
            //side1 , side 2 as string in print
            System.out.println("Rectangle");
            //System.out.println("Rectangle: " + side1 +", " + side2 + ", "+ side1+", " + side2);
        }
        in.close();
    }
}
