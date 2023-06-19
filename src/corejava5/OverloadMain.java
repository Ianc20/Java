package corejava5;

import java.util.Scanner;

public class OverloadMain {

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.sum();
        OverloadSub overloadSub = new OverloadSub();
        System.out.println("subsum1: " + overloadSub.sum(100,200));
        Scanner scanner = new Scanner(System.in);
        overload.sum(scanner);
        System.out.println("subsum2: " + overloadSub.sum(100,scanner));
    }
}
