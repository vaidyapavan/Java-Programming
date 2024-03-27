package Basic_java;




 class Animal
{
	 Animal()
	 {
		 String animal;
		 System.out.println("This is the parent class");
		 
	 }
	 
 void Concate ()
 {
	 String  fname="Pavan";
	 String  lname="vaidya";
	 
	 String fullnmae;
	 String fullName = fname.concat(lname);
	 
	 System.out.println(fullName);
	 
	 
	 
 }
	 
	 
	
}
 class Dog extends Animal
 {
	 Dog()
	 {
		 System.out.println("This is the Chiuld class");
		 super.Concate();                                  // use of Super keyword
	 }
	 
	 
 }
public class Inheritance1 {

	public static void main(String[] args) {
		
	
		Dog obj2 = new Dog();
		obj2.Concate();

		

	}

}
