package DSA;
import java.util.*;



class parentclass
{

	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("factorial of "+n+" is:"+fact)	;	
	}
}
public class Method {

	public static void main(String[] args) {
		parentclass obj = new parentclass();
		int n;
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		obj.fact(n);
		
	}

}
