package DSA;

import java.util.Arrays;

class anagram_string
{
	String string1="java";
	String string2="avaj";
	char arr1[]=string1.toCharArray();
	char arr2[]=string2.toCharArray();
	void check() {
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    if(Arrays.equals(arr1, arr2)) {
	        System.out.println("Strings are anagram");
	    } else {
	        System.out.println("Strings are not anagram");
	    }
	}
}
public class Anagram_string {

	public static void main(String[] args) {
		anagram_string obj = new anagram_string();
		obj.check();
		

	}

}
