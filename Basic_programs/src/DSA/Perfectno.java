package DSA;
import java.util.*;

public class Perfectno {

	public static void main(String args[]) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		n= s.nextInt();
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count=count+i;
			}
		}
		if(count==n)
		{
			System.out.println( n+" is perfect number");
			
		}
		else
		{
			System.out.println( n+" is not perfect number");
			
		}

	}

}
