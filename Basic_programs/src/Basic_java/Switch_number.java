package Basic_java;




class Switching_number
{
	void switch_number()
	{
		int a=20;
		int b=50;
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Numbers after the switching are: ");
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Switch_number {

	public static void main(String[] args) {
		
		Switching_number obj= new Switching_number();
		obj.switch_number();
		

	}

}
