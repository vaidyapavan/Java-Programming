package Basic_java;

import java.util.*;

class ReverseExample {
    ArrayList<Integer> arr = new ArrayList<>();

    void example() {
        arr.add(10);
        arr.add(50);
        arr.add(90);
        arr.add(20);
        arr.add(11);
        arr.add(22);
        arr.add(500);
        System.out.println("Array before reversing:");
        System.out.println(arr);
    }

    void reverse() {
        int n = arr.size();
        int j = n - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
    }

    void show() {
        System.out.println("ArrayList after reversing:");
        System.out.println(arr);
    }
}

public class  Reverse_arrayliist  {
    public static void main(String[] args) {
        ReverseExample obj = new ReverseExample();
        obj.example();
        obj.reverse();
        obj.show();
    }
}
