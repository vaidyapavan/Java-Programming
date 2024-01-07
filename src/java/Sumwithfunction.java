package java;





public class Sumwithfunction {
	int sum;
	Sumwithfunction(){
		
	}
	void add(int x,int y)
	{
		sum= x+y;
		System.out.println("sum of a and b is:"+sum);
	}
	

	public static void main(String[] args) {
		Sumwithfunction p=new Sumwithfunction();
		p.add(3,5);
	

	}

}
