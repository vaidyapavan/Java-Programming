package java;



public class Basic {
	public static void main(String[] args)
	{
		System.out.println("this is the basic program of \"java\" ");
		System.out.println("java is an easy language if we \'practice on the daily basis\'");
		System.out.println(Math.max(50,29));
		System.out.println(Math.random());
		System.out.println(Math.sqrt(25));
		int x=20;
		int y=40;
		System.out.println(x>y);
		System.out.println(8>3);
		int time=20;
		if(time<18);
		{
			System.out.println("good day");
		}
		
		{
			System.out.println("good night");
		}
		int day=2;
		switch(day)
		{

		case 1:if(day==1);
		System.out.println("monday");
		break;
		case 2:if(day==2);
		System.out.println("tuesday");
		break;
		case 3:if(day==3);
		System.out.println("wendesday");
		break;
		default:if(day==6);
		System.out.println("looking for the officially holiday");
		break;
		
		
		}
		int i=0;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		for(i=0;i<=20;i++)
		{
		
			System.out.println(i);
		}
		int[] array= {3,5,7,8,90,70,3};
		String[] Day= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		System.out.println(array[4]);
		System.out.println(Day[4]);
		System.out.println(array.length);
		int[][] multarray= {{3,4,5,6,7},{7,8,6,0,8,}};
		System.out.println(multarray[0][4]);
		
		
		}
	}



