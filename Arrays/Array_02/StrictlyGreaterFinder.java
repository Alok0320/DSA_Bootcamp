// Count the number of elements strictly greater than value x
// input : arr = [7, 9, 8, 4, 3, 6] , x = 7
// Output : 8, 9

import java.util.Scanner;
public class StrictlyGreaterFinder {
    
    static int StrictlyGreater(int[] arr, int x) {

        // logic

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        // Constraints ( Defining values)

        /* 

        int[] arr = {7, 9, 8, 4, 3, 6};

        int x = 7;

        int ans = StrictlyGreater(arr, x);  // function call

        System.out.println("Number of elements strictly greater than x :" + ans);

        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array arr :");
        int n = sc.nextInt();

        System.out.println("Enter the value of X :");
        int x = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = StrictlyGreater(arr, x);
        System.out.println("Number of elements strictly greater than x : " + ans);
        
    }

}
