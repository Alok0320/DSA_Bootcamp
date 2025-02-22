
// Two pointer approach to solve reverse of array question ( inlace ( without creating a new array))

import java.util.*;
public class Reverse2 {


    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length-1;

        while(i < j) {
            swapInArray(arr, i , j);
            i++;
            j--;
        }
    }
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        printArray(arr);
    }
}
