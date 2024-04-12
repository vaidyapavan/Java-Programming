package DSA;

public class Search_element_in_array {

	public static void main(String[] args) {
		int[] arr= {12,89,56,3,4,7,9,76,89,45};
		
		int search_element=9;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_element)
			{
				System.out.println("element is found at index "+i)
;			}
		}

	}

}
