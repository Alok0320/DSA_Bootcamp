// Reverse an array consisting of integer values.
// Input : {1, 2, 3, 4, 5}
// Output : {5, 4, 3, 2, 1}

import java.util.*;

public class Reverse {

    static int[] reverseArray(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        // traverse original array in reverse direction

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];   // ans[j] = arr[i];
                                // j++;
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        System.out.println("Reversed Array : ");
        int[] ans = reverseArray(arr);
        printArray(ans);


    }
}