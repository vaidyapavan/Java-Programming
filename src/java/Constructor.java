package java;

/**
 * 
 */


/*
 
public class Constructor {
	float b;
 public Constructor()
{
	 b=0;
	}
	
	
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		System.out.println(obj.b);
		

	}

}
*/
public class Constructor {
	  int modelYear;
	  String modelName;

	  public Constructor(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
	    Constructor myCar = new Constructor(2002, "thar");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}
