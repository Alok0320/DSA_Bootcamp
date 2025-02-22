// Given 2 intergers a and b.Swap the 2 given values using sum and difference method.




import java.util.*;

public class Swap {

    static void swaping(int a, int b) {
        
        a = a + b;
        b = a - b;
        a = a - b;

        
    }    
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();

        swaping(a, b);
        System.out.println("After swaping : ");

        System.out.println("Print a : " + a);
        System.out.println("Print b : " + b);
    }
}