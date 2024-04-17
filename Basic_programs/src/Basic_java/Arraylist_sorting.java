package Basic_java;

import java.util.ArrayList;
import java.util.Collections;

class sortExample
{
    ArrayList<Integer> arr = new ArrayList<>();

    void example() {
        arr.add(10);
        arr.add(50);
        arr.add(90);
        arr.add(20);
        arr.add(11);
        arr.add(22);
        arr.add(500);
        System.out.println("Array before sorting is::");
        System.out.println(arr);
    }

    void sort() {
    	
    	Collections.sort(arr);
        
    }

    void show() {
        System.out.println("ArrayList after sorting is::");
        System.out.println(arr);
    }
}


public class Arraylist_sorting {

	public static void main(String[] args) {
		sortExample obj = new sortExample();
		obj.example();
		obj.sort();
		obj.show();
		

	}

}
