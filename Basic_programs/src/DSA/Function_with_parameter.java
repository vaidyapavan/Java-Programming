package DSA;



class prime
{
	void primenumber(int n)
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
			System.out.println( n+" is not prime number");
		}
		else
		{
			System.out.println( n+" is prime number");
		}
	}
}
public class Function_with_parameter {

	public static void main(String[] args) {
		prime obj= new prime();
		obj.primenumber(9);
		
	

	}

}
