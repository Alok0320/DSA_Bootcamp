// Find the last occurrence of an element z in a given array 
//  Input :  arr = [5, 6, 5, 3, 5, 4] , x = 5
//  Output : 4  ( 5's last occurrence is at 4th index)

import java.util.Scanner;

public class LastOccurrence {
    
    // static int last_Occurrence(int[] arr, int x) {
    //     int lastIndex = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == x){
    //             lastIndex = i;
    //         }
    //     }
    //     return lastIndex;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number whose last occurenece to be found : ");
        int x = sc.nextInt();

        System.out.println("Enter number of elements in array arr : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int lastIndex = -1;

        System.out.println("Enter elements of array arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == x) {
                lastIndex = i;
            }
        }

        System.out.println("Printing last occurrence of x : " + lastIndex);
        
        System.out.println("Printing elements of array arr : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
