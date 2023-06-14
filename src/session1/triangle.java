package session1;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side1 of triangle");
        double side1 = in.nextDouble();
        System.out.println("Enter the side2 of triangle");
        double side2 = in.nextDouble();
        System.out.println("Enter the side3 of triangle");
        double side3 = in.nextDouble();
        if (side1 > 0 && side2 > 0 && side3 > 0 && (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            }
            else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }
        }
        else {
            System.out.println("Not a Triangle");
        }
        in.close();
    }
}
