package corejava4;

import java.util.Scanner;

public class V2ChatBot {

    String name;

    public V2ChatBot() {
    }

    public void hello(Scanner scan) {
        System.out.println("Welcome to AB bank!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!" );
        this.name = name;
    }
    
}
