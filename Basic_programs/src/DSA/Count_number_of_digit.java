package DSA;
import java.util.*;

public class Count_number_of_digit {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner s= new Scanner(System.in);
		
		int n;
		n=s.nextInt();
		int count=0;
		while(n>0)
		{
			
			n=n/10;
			count++;
			
			
		}
		System.out.println("Numbr of digits sre:"+" "+ count);
		
	}

}
