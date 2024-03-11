package DSA;

import java.io.*;
import java.util.*;

public class Reversestring {

    public static void main(String[] args) {
        String inputstring;
        Scanner s = new Scanner(System.in);
        inputstring = s.nextLine();
        int count = 0;
        int i;
        int j = inputstring.length() - 1;
        for (i = 0; i < j; i++, j--) {
            if (inputstring.charAt(i) != inputstring.charAt(j)) {
                count++;
                break; 
            }
        }
        if (count > 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
