package Basic_java;


class overriding
{
	
	void parent()
	{
		System.out.println("This is the parent class");
	}
	
}
class child extends overriding
{
	void parent()
	{
		System.out.println("This is the child class");
		
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		child obj = new child();
		obj.parent();
	

	}

}
