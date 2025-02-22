// Find the second largest element in the given array
// Input : arr = { 9, 8, 9, 6, 9, 5, 8}
// Output : 8


// 1 - Find Maximum
// 2 - Mark all maximums as infinity
// 3 - Find maximum again (Will be second maximum)


import java.util.*;

public class SecondLargestFinder {
    
    static int Largest(int[] arr){
        
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++) {
            if ( arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int SecondLargest(int[] arr) {
        int mx = Largest(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;

            }
        }

        int secondMax = Largest(arr);  // calling function Largest to find largest element in new array 

        return secondMax;
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

        System.out.println("Second Largest Number is : " + SecondLargest(arr));
    }
        

        
    
}
