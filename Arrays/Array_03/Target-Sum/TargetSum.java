
// Pattern : Target Sum
// Find the total number of pairs in the array whose sum is 
// equal to the given value x.
// Input : arr = {4, 6, 3, 5, 8, 2} , target = 7
// Output : 2   {(4, 3), (5, 2)}


// package Array_03;

import java.util.*;

public class TargetSum {
    
    static int pairSum(int[] arr, int target) {
        int n = arr.length;

        int ans = 0;

        for(int i = 0 ; i < n ; i++) {  // first number
            for(int j = i + 1 ; j < n ; j++) {   // second number
                 if (arr[i] + arr[j] == target) {
                    ans++;
                 }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.print("Enter Target Value : ");
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = pairSum(arr, target);
        System.out.println("Number of pairs is : " + answer);

    }
}
