package DSA;
import java.util.*;
import java.util.ArrayList;





class arraylist
{
	arraylist()
	{
		ArrayList<Integer>rollno= new ArrayList<Integer>();
		rollno.add(10);
		rollno.add(20);
		rollno.add(90);
		rollno.add(5);
		rollno.add(4);
		rollno.add(120);
		System.out.println(rollno);
		rollno.set(2, 100);
		rollno.set(1, 0000);
		System.out.println(rollno);
		rollno.remove(1);
		System.out.println(rollno);
		int size =	rollno.size();
		System.out.println("Size on an arraylist is:"+size);
		
		for(int i=0;i<rollno.size();i++)
		{
			System.out.print(rollno.get(i));
			System.out.print(",");
			
		}
		System.out.println("");
		Collections.sort(rollno);
		System.out.print(rollno);
		
		
		
		
		
		
		
	}
	
}
public class Arraylist1 {

	
	
	
	
	public static void main(String[] args) {
		 arraylist list = new arraylist();
		
		
		

	}

}
