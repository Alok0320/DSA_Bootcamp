package Array_01;

// Traversing through the array - We can use loops to traverse
            //   through the array. There are many ways to iterate
            //    over the array. The most common ways of looping 
            //    through arrays in java are :

            //    For loop
            //    For each loop
            //    While loop



public class traversing {
    public static void main(String[] args) {

        int[] ages = new int[3];

        ages[0] = 88;
        ages[1] = 20;
        ages[2] = 3;

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);

        // Traversing using loop

        // For loop 

        // for(int i = 0; i < 3; i++) {
            for(int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // For each loop

        for(int i : ages) {  // limitation = Only can print whole array , can not print number of desired element in an array 
            System.out.println(i);
        }

        // While loop

        int i = 0;
        while(i < ages.length) {
            System.out.println(ages[i]);
            ++i;
        }


        // Traversing a multidimensional array

        System.out.println("Traversing a multidimensional array");

        int[][] arr = {{56,43,6}, {34, 7, 8}};

        for(int c = 0; c < arr.length; c++) { // size of array
            // arr[0] and arr[1]
            for(int d = 0; d < arr[c].length; d++ ) { // arr[c] = arr[0], arr[1]    (size of arrays of array)
                System.out.println(arr[c][d]);
            }
        }
    }
}
