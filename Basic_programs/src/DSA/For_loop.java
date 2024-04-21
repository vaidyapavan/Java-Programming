package DSA;

class sum
{
	
	void sum_n_number()
	{
		int n=10;
		int sum=0;
		for (int i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of first "+n+" number is: "+sum);
	}
}

public class For_loop {

	public static void main(String[] args) {
		sum obj= new sum();
		obj.sum_n_number();
		

	}

}
