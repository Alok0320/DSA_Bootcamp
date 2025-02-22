import java.util.Scanner;

public class DeepCopy {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of array :");
        int n = sc.nextInt();
        System.out.println(n);
        int[] arr_1 = new int[n];

        
        printArray(arr_1);
    
    }
    
}
