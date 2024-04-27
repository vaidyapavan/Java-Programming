package java;
import java.util.*;

class prime
{
	void check()
	{
		int no;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		no= s.nextInt();
		int count=0;
		for(int i = 2; i * i <= no; i++)
		{
		    if(no % i == 0)
		    {
		        count++;
		        break;
		    }
		}
		if(count>0)
		{
			System.out.println(no+" is not prime: ");
			
		}
		else
		{
			System.out.println(no+" is  prime: ");
			
			
		}
	}
}
public class Prime_number {

	public static void main(String[] args) {
		prime obj= new prime();
		obj.check();
		

	}

}
