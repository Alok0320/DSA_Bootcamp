// How to find a maximum value in an array

import java.util.*;

public class Largest {
    static int LargestValue(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];

            }
        }
        return mx;

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

        System.out.println("Largest Number is : " + LargestValue(arr));
    }
}
