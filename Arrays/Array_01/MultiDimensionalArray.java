package Array_01;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr_1 = new int[5][3];

        int[][] arr = {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}};
    
        // arr[0] = array, arr[0][2]

        System.out.println(arr[0][0]); 
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        // 3-D Array

        int[][][] arr_3 = new int[5][3][2]; // 5*3*2 = 30
        arr_3[0][0][0] = 1;

        // Length of array

        System.out.println("Length of an array");

        System.out.println(arr.length);

        System.out.println(arr_3.length);
    }
}
