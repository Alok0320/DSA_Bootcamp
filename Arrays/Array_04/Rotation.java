// Rotate the given array 'a' by k steps, where k is non-negative.
// Note : k can be greater than n as well


import java.util.*;

public class Rotation {
    
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];

        }

        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int n = sc.nextInt();

        
        System.out.println("Enter number of Rotations :");
        int k = sc.nextInt();

        System.out.println("Enter elements :");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = rotate(arr, k);

        System.out.println("Array after rotation : ");
        printArray(ans);
    }


}
