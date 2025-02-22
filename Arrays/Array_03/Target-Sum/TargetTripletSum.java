// Count the number of triplets whose sum is equal to the given value x.



import java.util.Scanner;

public class TargetTripletSum {
    
    static int tripletSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;


        // phle andr k loop iterate hokr khtm honge < n times tb uske bahr ka loop iterate hoga, 
        // third loop phle j+1 k liye < n time iterate hoga , phir j+1+1 k liye < n times , phir 
        // j+1+1+1 ......,,, phir i = o se 1 ho jayega and same process again higa aise hi i < n tk hoga.

        for (int i = 0; i < n; i++) { // first number 
            for (int j = i + 1; j < n; j++) {  // second number
                for (int k = j + 1; k < n; k++) {  // third number
                    if(arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
            
        }
        return ans;

    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.print("Enter Target Value : ");
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = tripletSum(arr, target);
        System.out.println("Number of pairs is : " + answer);

    }
}
