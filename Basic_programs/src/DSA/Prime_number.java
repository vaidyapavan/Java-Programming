package DSA;

import java.util.*;
class  prime1
{
	void check(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count>0)
		{
			System.out.println( n+" is not prime");
			
		}
		else
		{
			System.out.println( n+" is prime");
			
		}
		
		
	}
}
public class Prime_number {

	public static void main(String[] args) {
		prime1 obj =new prime1();
		System.out.println( "enter the number");
		int n;
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		obj.check(n);
	

	}

}
