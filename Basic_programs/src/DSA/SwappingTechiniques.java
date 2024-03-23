package DSA;

public class SwappingTechiniques {

	public static void main(String[] args) {
		
		//    *******************Logic 1***************************************  
//		int a=50;
//		int b=90;
//		System.out.println("Values Before the reversing number:" +a+ ","+b);
//		int temp;
//		 temp= a;
//		 a=b;
//		 b=temp;
//		 System.out.println("Values after the reversing number:" +a+ ","+b);
		
		
		
		
	//**************************** logoc 2*******************************
		
//		int a=50;
//		int b=90;
//		System.out.println("Values Before the reversing number:" +a+ ","+b);
//		a=a+b;
//		b=a-b;
//		 a=a-b;
//		 System.out.println("Values after the reversing number:" +a+ ","+b);
		
		//************************logoc 3*************************************
		
		int a=50;
		int b=90;
	System.out.println("Values Before the reversing number:" +a+ ","+b);
	
	
	a=a*b;
	
	b=a/b;
	a=a/b;
	System.out.println("Values after the reversing number:" +a+ ","+b);
	}

}
