package DSA;
import java.util.Arrays;
public class Array_equal_checking {

	public static void main(String[] args) {
		int arr1[]= {1,4,6,8,96,7,8};
		int arr2[]= {1,4,6,8,96,7,8,7};
		
		boolean status = Arrays.equals(arr1, arr2);
		
		if(status==true)
		{
			System.out.println("arrays are equal");
			
		}
		else
		{
			System.out.println("arrays are not equal");
			
		}
		
		
		
		}

	}


