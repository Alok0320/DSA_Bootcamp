package Array_01;

// Calculate the maximum value out of all the elements in the array.
//    Input arr[] = {1, 5, 3}
//    Output : 5

public class MaxOfArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3};

        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Maximum Value is : " + ans);
    }
}
