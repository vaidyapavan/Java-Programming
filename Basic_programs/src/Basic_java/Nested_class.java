package Basic_java;


class class1
{
	class1()
	{
		System.out.println("This is the outer class known as class1");
	}
	
	class class2
	{
		class2()
		{

			System.out.println("This is the inner class known as class2");
		}
			}
}
public class Nested_class {

	public static void main(String[] args) {
		
		class1 outerobj= new class1();
		
		class1.class2 innerobj= outerobj.new class2();
		
	}

}
