import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = new int[5];
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        // arr[3] = sc.nextInt();
        // arr[4] = sc.nextInt();

        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter array elements :");
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i]  = sc.nextInt();
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        

    }
}