package Basic_java;

class overloading
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
{
return a+b+c;
}
}
public class Method_overloading {
	
	
	

	public static void main(String[] args) {
		
		overloading s= new overloading();
		 //int result=s.add(8, 9);//         call to first method
		
		int result=s.add(8, 9,90);
		 
		 System.out.println("sum is:"+result);
		
		
		
	}

}
