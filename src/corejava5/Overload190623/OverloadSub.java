package corejava5.Overload190623;

import java.util.Scanner;

public class OverloadSub extends Overload{
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,Scanner in){
        System.out.println("Enter number to add " + a + ": ");
        int b = in.nextInt();
        return a+b;
    }
}
