package DSA;
import java.util.*;

class prime_number
{
	void prime()
	{
		int no;
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		no= s.nextInt();
		int count=0;
		for(int i=2;i<no;i++) // Start from i=2, not i=0
		{
			if(no%i==0)
			{
				count++;
				break;
			}
		}
		if(count>0 || no == 1) // If count > 0 or the number is 1, it's not prime
		{
			System.out.println(no+" is not prime");
		}
		else
		{
			System.out.println(no+" is prime");
			
		}
			
		}
	}
		
	
	
public class Primenumber1 {

	public static void main(String[] args) {
		prime_number obj= new prime_number();
		obj.prime();
		

	}

}
