package DSA;

public class Stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder str= new StringBuilder("Good morning");
		System.out.println(str);
		System.out.println(str.charAt(3));
		str.setCharAt(0,'a');
		System.out.println(str);
		str.insert(0, 'T');
		System.out.println(str);
		str.delete(2, 4);
		str.append("Pavan");
		System.out.println(str);
		
		int len=  str.length();
		System.out.println("length of the string is:" + len);
		
		

	}

}
