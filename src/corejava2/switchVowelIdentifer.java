package corejava2;

import java.util.Scanner;

public class switchVowelIdentifer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = in.next().charAt(0);
        //if ch is a number,return it a digit
        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
            
        }else {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(ch + " is a Vowel");
                    break;
                default:
                    System.out.println(ch + " is a Consonant");
                    break;
            }
        }
        in.close();
    }
}
