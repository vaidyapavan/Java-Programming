package Basic_java;


abstract class vehicle
{
	abstract void price();
	
}

class car extends vehicle
{
	void price()
	{
		System.out.println("my car price is:");
	}
}

class motorcycle extends vehicle
{
	void price()
	{
		System.out.println("my motorcycle  price is:");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		
		car obj= new car();
		obj.price();
		motorcycle obj2= new motorcycle();
		obj2.price();
		//vehicle obj3= new vehicle();      we can not create the object of abstract class
		

	}

}
