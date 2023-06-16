package corejava4;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // a unsort array
        int arr[] = {12, 11, 13, 5, 6, -2, 1, 2, 4};
        Arrays.sort(arr);
        printArray("Sorted array", arr);
    }
    private static void printArray(String message, int arr[]) {
        System.out.println(message + ": [length: " + arr.length + "]");
        for (int i = 0; i < arr.length; i++) {
            if(i !=0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
}
