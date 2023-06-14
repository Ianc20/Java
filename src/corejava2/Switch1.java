package corejava2;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month \n1.Jan\n2.Feb\n3.Mar\n4.Apr\n5.May\n6.Jun\n7.Jul\n8.Aug\n9.Sep\n10.Oct\n11.Nov\n12.Dec");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;

            case 9:
            case 10:
                season = "Autumn";

            default:
                season = "Invalid";
            
        }
        System.out.println("Month " + month + " fall in " + season);   
        scanner.close();
    } 
}
