package corejava3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String[] month_name = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth month: ");
        int month = sc.nextInt();
        System.out.println("Your birth month is " + month_name[month -1]);
        sc.close();
    }
    
}
