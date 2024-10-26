package DSA;

import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Smallest_largest_substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int K = scanner.nextInt();

        String smallest = S.substring(0, K); // Initialize smallest and largest substrings
        String largest = S.substring(0, K);

        for (int i = 0; i <= S.length() - K; i++) {
            String substring = S.substring(i, i + K); // Extract substring of length K

            if (substring.compareTo(smallest) < 0) { // Compare with smallest substring
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) { // Compare with largest substring
                largest = substring;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
