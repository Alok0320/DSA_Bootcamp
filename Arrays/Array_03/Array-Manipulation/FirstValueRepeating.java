// Given an array consisting of integers. Return the first value that is 
// repeating in this array. If no value is being repeated, return -1
// Input : {1,5,3,4,6,3,4}
// Output : 3


import java.util.*;

public class FirstValueRepeating {
    
    static int firstValue(int[] arr) {
        

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];  // jhan pr bhi return likh dete h vhan pr method khtm ho jata h 
                }
            }
        }
        return -1;
        
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

        System.out.println("First Repeating value is : " + firstValue(arr));
    }
}
