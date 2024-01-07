package java;



public class Function{
	
	static void age(String name, int age) {
		System.out.println("My name is " + name + " and my age is " + age);
	}
	
	static void add(float a, float b) {
		float p;
		p = a + b;
		System.out.println("Addition is: " + p);
	}
	
	static void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Addition is: " + c);
	}
	
	void show() {
		System.out.println("This is the show method");
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int sum;
		sum = x + y;
		System.out.println("Sum of x and y is: " + sum);
		
		Function myObj = new Function();
		myObj.show();
		myObj.add(3, 6);
		myObj.add(3, 9);
		myObj.age("pavan", 20);
	}

}

