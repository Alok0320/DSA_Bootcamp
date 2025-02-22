// Sort an array consisting of only 0s and 1s
// Input - {1,0,0,1,0,1,1,0,0}
// Output - {0,0,0,0,0,1,1,1,1}

import java.util.*;
public class sortZerosOnes {
     
    static void printArray(int[] arr ) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);
    }
}
