// Count the number of occurrences of a particular element x
// Input : arr = [5, 6, 5, 1, 5], x = 5
// Output : 3


import java.util.Scanner;

public class CountOccuerence {

    // static int countOccurences(int array, int x)



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int n = sc.nextInt();

        System.out.println("Enter value of x :");
        int x = sc.nextInt();

        int count = 0;
        int[] arr = new int[n];

        System.out.println("Printing elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == x) {
                count++;
                
            }
        }
        System.out.println("Number of occurences of x is : " + count);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

    }
}
