
// Relevent Information about static :
//      1 - Static methods can only access static variables.
//      2 - Static method can only call other static method.
//      3 - Static methods can not refer to non-static varibales or methods.




import java.util.Scanner;

public class ArrayReferences {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter array elements :");
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i]  = sc.nextInt();
            
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // Method printArray call

        System.out.println("Original Array :");
        printArray(arr);        // baar baar print krana pdta h same code likh kr array ko iss liye uss code ka ek method bna diya taki baar baar same code likhne k bjay uss method ko call kr lu




        // Shallow Copy   ( will affect original array if we make changes in new array)


        System.out.println("Copied Array");
        int[] arr_2 = arr;
        printArray(arr_2);

        

        // Changing some values of arr_2

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original array arr after changing arr_2 :");
        printArray(arr);

        System.out.println("Copied array arr_2 after changing arr_2 :");
        printArray(arr_2);

        // arr and arr_2 both are referencing same memory address, so changes will be done in both 



        // Deep copy  ( will not affect original array if we make changes in new array)


        // int[] arr_2 = arr.clone();


    }

    // static void changeArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = 0;
    //     }
    // }
    
}


