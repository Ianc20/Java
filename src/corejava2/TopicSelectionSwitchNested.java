package corejava2;

import java.util.Scanner;

public class TopicSelectionSwitchNested {
    // enter a topic : 1.JS, 2.JAVA, 3.RDBMS
    // enter a selection : JS: 1JS variable, 2ESC, 3promises, JAVA:1Core java,2multithreading,3swing, RDBMS:1SQL, 2oracle,3mysql
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a topic : 1.JS, 2.JAVA, 3.RDBMS");
        int topic = scanner.nextInt();
        if(topic == 1){
            System.out.println("Enter a selection :1.JS variable, 2.ESC, 3.Promises");
        }else if(topic == 2){
            System.out.println("Enter a selection :1.Core java, 2.multithreading, 3.swing");
        }else if(topic == 3){
            System.out.println("Enter a selection :1.SQL, 2.oracle, 3.mysql");
        }else{
            System.out.println("Invalid");
        }
        int selection = scanner.nextInt();
        switch (topic) {
            case 1:
                switch (selection) {
                    case 1:
                        System.out.println("Your topic is JS and your selection is JS variable");
                        break;
                    case 2:
                        System.out.println("Your topic is JS and your selection is ESC");
                        break;
                    case 3:
                        System.out.println("Your topic is JS and your selection is promises");
                        break;
                }
                break;
            case 2:
                switch (selection) {
                    case 1:
                        System.out.println("Your topic is Java and your selection is Core java");
                        break;
                    case 2:
                        System.out.println("Your topic is Java and your selection is multithreading");
                        break;
                    case 3:
                        System.out.println("Your topic is Java and your selection is swing");
                }
                break;
            case 3:
                switch (selection) {
                    case 1:
                        System.out.println("Your topic is RDBMS and your selection is SQL");
                        break;
                    case 2:
                        System.out.println("Your topic is RDBMS and your selection is oracle");
                        break;
                    case 3:
                        System.out.println("Your topic is RDBMS and your selection is mysql");
                        break;
                }
                break;
        }
        scanner.close();
    }

    
}
