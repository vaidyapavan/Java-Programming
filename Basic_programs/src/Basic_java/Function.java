package Basic_java;



class paremeterized_function
{
	void addition(int a, int b)
	{
		int c= a+b;
		
		System.out.println("sum of a and b is:"+c);
	}
}

class factorial
{
	int fact=1;
	void fact(int n)
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of"+n+ "is:"+fact);
		
	}
}


public class Function {

	public static void main(String[] args) {
		
		paremeterized_function obj= new paremeterized_function();
		obj.addition(90, 45);
		factorial obj2=new factorial();
		obj2.fact(5);
		
		
	}

}
