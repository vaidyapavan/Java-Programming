package Basic_java;








class a
{
	
		a()
		{
			System.out.println("this is parent class");
		
		}
}

class b extends a
{
	b()
	{
		System.out.println("this is child class b ");
		
	}
}
class c extends a
{
	c()
	{
		System.out.println("this is child class  c");
		
	}
}
public class Inheritance11 {

	public static void main(String[] args) {
		c obj= new c();
		b obj1= new b();
	}

}
