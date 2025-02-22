// Pattern - Array Manipulation

// Find the unique number in given Array where all the elements are elements are being 
// repeated twice with one value being unique.
// Input : arr = {1, 1, 5, 5, 5, 6, 7, 7}

// 1 - Traverse all pairs 
// 2 - Equal pairs -> Mark -1
// 3 - Traverse array again, value > 0 is our answer

import java.util.*;

public class UniqueNumber {

    static int uniqueNumberFinder(int[] arr) {
        int ans = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array arr : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique Number is : " + uniqueNumberFinder(arr));
    }
    
}
