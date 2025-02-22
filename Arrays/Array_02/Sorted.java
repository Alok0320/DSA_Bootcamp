// Check if the given array is sorted or not.


import java.util.Scanner;

public class Sorted {
    
    static boolean isSorted(int[] arr) {
        boolean check = true;    //  iss variable ko hi return karana h 


        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                check = false;  // Not sorted
                break;
            } else  {
                check = true;  // sorted
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");
        int[] arr  = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}
