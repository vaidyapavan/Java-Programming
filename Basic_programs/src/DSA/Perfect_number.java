package DSA;
import java.util.*;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n;
		n=s.nextInt();
		int sum=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println( n+" is perfect number");
			
		}
		else
		{
			System.out.println( n+" is not  perfect number");
			
		}
		
	
		

	}

}
