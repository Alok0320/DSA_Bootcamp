package Array_01;
// Linear Search

// Search given element x in an array. if present,
//  then return the index else return -1
//          Input: arr[] = {10, 5, 3, 6, 2, 8, 4}
//          x = 5
//          Output : 1 (index)


public class Search {
    public static void main(String[] args) {

        // Linear search

        int[] arr = {10, 5, 3, 6, 2, 3, 4};

        int x = 3;
        // int x = 20;
        int ans = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        if(ans == -1) {
            System.out.println("Not Found");
        } else {
        System.out.println("Found " + x + " at index " + ans);
        }
    }
}
