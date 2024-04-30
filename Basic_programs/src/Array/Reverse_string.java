package Array;
 class string_reverse
 {
	 String str="pavan vaidya";
	 int n= str.length();
	 char[] array = str.toCharArray();
	
	 void reverse() {
		    // Assuming n is the length of the array str
		    int j = n - 1; // Initialize j to the last index of the array
		    for (int i = 0; i < j; i++, j--) {
		        char temp = array[i];
		        array [i] = array [j];
		        array  [j] = temp;
		        // Print the reversed array
			 for (int i = 0; i < n; i++) {
			  System.out.print(str[i]);
		    }

		   
		    }
		}

	  }
 }
public class Reverse_string {

	public static void main(String[] args) {
		string_reverse obj = new string_reverse();
		obj.reverse();
		
	}

}
