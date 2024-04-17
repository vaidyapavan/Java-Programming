package DSA;
import java.util.*;


class example_of
{
	ArrayList<Integer> arr= new ArrayList<>();
	int n=arr.size();
	void example()
	{
		
		
		arr.add(10);
		arr.add(50);
		arr.add(90);
		arr.add(20);
		arr.add(11);
		arr.add(22);
		arr.add(2,500);
	}
	
	void show()
	{
		System.out.println(arr.get(2));
		System.out.println("Arraylist elements are:");
		System.out.println(arr);
		
	}
	void set_element()
	{
		arr.set(1, 900);
		System.out.println(arr);
		
		
		
	}
	
	void remove()
	{
		arr.remove(1);
		System.out.println(arr);
	}
	
}
public class Arraylist {

	public static void main(String[] args) {
		example_of obj = new example_of();
		 obj.example();
		 obj.show();
		 obj.remove();
		

	}

}
