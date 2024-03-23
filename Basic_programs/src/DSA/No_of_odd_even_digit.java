package DSA;
import java.util.*;


public class No_of_odd_even_digit {
	public static void main(String args[])
	{
	System.out.println("enter the number:");
	Scanner s= new Scanner(System.in);
	int n;
	

	n=s.nextInt();
	int evencount=0;
	int oddcount=0;
	
	while(n>0)
	{
		int last_digit;
		last_digit=n%10;
		n=n/10;
		if(last_digit%2==0)
		{
			evencount++;
			
		}
		else {
			oddcount++;
		}
		
	
		
		
	}
	System.out.println("total even no are::"+" "+ evencount);
	System.out.println("total odd no are::"+" "+ oddcount);

}
}
