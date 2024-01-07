package java;

import java.util.Scanner;

public class StringExample {
    public static void main(String args[]) {
        String a = "pavan vaidya";
        System.out.println(a);

        String st;
        System.out.println("Enter the string:");
        Scanner s = new Scanner(System.in);
        st = s.next();
        System.out.println("My name is " + st);
        System.out.println("Length of the string: " + st.length());

        String st1 = "this is my college";
        System.out.println("Characters in the string:");
        for (int i = 0; i < st1.length(); i++) {
            System.out.println(st1.charAt(i));
        }
    }
}
