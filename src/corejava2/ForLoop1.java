package corejava2;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (; ;) {
                System.out.println("Enter Yes/No");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                     System.out.println("java is easy to learn");
                }else {
                    break;
                }
            }
            sc.close();
        }
    }
}
