// Given Q queries, check if the given number is present in the array or not.

// Note : Value of all the elements in the array is less than 10 to the power 5.

// Concept of frequency array


import java.util.*;

public class Queries {
    
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println(":Enter number of queries :");
            int x = sc.nextInt();
            if(freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
        }
}
