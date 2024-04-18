package Basic_java;
import java.util.*;

class stack
{
	Stack<Integer> stack= new Stack<>();
	void stack_example()
	{
		
		
		stack.push(90);
		stack.push(45);
		
		stack.push(56);
		stack.push(5);
		stack.push(4);
	}
	void show()
	{
		System.out.println("Stack element are");
		
		System.out.println(stack);
		System.out.print("peek element is:");
		System.out.println(stack.peek());
		System.out.println("Size of the stack is:"+stack.size());
		
	}
}
public class Stacck_example {

	public static void main(String[] args) {
		stack obj =new stack();
		obj.stack_example();
		obj.show();
		

	}

}
