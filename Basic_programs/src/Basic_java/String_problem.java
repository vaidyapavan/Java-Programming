package Basic_java;

import java.util.*;

public class String_problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A;
        String B;
        A = s.nextLine();
        B = s.nextLine();
        
        int count1 = A.length();
        int count2 = B.length();
        int count = count1 + count2;
        System.out.println(count);
        
        int check = A.compareTo(B);
        if(check > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String A1 = A.toUpperCase().substring(0, 1)+A.toLowerCase().substring(1,count1);
        String B2 = B.toUpperCase().substring(0, 1)+B.toLowerCase().substring(1,count2);
        System.out.println(A1 + " " + B2);
    }
}
