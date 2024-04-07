package DSA;
import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//        int[] array;
//        array = new int[5];
        int[] array1 = {1, 2, 3, 4, 5};
        
        int sum=0;
        for(int i=0; i<array1.length; i++) {
            sum = sum + array1[i]; // Add array elements to the sum
        }
        
        System.out.println("array element sum is: " + sum);
    }
}
