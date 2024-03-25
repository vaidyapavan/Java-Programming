package DSA;

public class Duplicate_element_in_array {

    public static void main(String[] args) {
        
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 3, 6, 1};
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
        	 
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    if(count==1) {
                        System.out.println("Duplicate elements are:");
                    }
                    System.out.println(arr[i]);
                    break; // Exit the inner loop once a duplicate is found
                }
            }
        }
        if(count == 0) {
            System.out.println("There are no duplicate elements in the array.");
        }
    }
}
