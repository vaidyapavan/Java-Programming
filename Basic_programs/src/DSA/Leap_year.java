package DSA;
import java.util.*;

public class Leap_year {

    public static void main(String[] args) {

        int year;
        Scanner s= new Scanner(System.in);
        
        // Prompting user to enter the year
        System.out.println("Enter the year:");
        year=s.nextInt();
        
        // Checking if the entered year is a leap year
        if(year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
