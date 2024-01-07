package java;



//import ddr.animal;
//import ddr.dog;

public class Inheritance {
    public static void main(String[] args) {
    	Inheritance a = new Inheritance();
        a.property();
    }

    void property() {
        System.out.println("Animal noises");
    }
}

class dog extends Inheritance {
    public static void main(String[] args) {
        dog a = new dog();
        a.property();
    }
}