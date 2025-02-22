// Returning largest and smallest element in an array in form of array 

import java.util.*;

public class SmallestOrLargestFinder {
    
    static int[] SmallestOrLargest(int[] arr) {   // return type is arrauy because we want to return an array
        Arrays.sort(arr);   // In built method for sorting array
        int[] ans = {arr[0], arr[arr.length-1]};   // first and last element of array
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nuumber of elements you want in array arr : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array arr : ");

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = SmallestOrLargest(arr);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : " + ans[1]);

    }
}
