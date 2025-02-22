package Array_01;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] ages = new int[3];
        // float[] weight = new float[4];
        // String[] array = new String[4];

        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        // Length of array 

        System.out.println("Length of array");

        System.out.println(ages.length);

        // weight[0] = 23.5f;
        // weight[1] = 55.6f;

        // Array Literals

        String[] names = {"alok", "chhaya", "Sunny"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // Length of array
        
        System.out.println("Length of array");

        System.out.println(names.length);
}
}