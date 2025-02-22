package Array_01;
// Calculate the sum of all the elements in the given array.
//     Input : arr[] = {1, 5, 3}
//     Output : 9

public class Sum {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3};
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++) {
            sum = sum + arr[i];
           //  System.out.println(sum);  // yhan hr step iterate hokr print hoga // 1, 6, 9
        }
        System.out.println(sum);   // yhan pr final sum print hoga 


    }
}