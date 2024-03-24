package DSA;
import java.util.Random;

public class Random_no_generator {

    public static void main(String[] args) {
        
        Random r = new Random();
        int rnumber = r.nextInt(1000);
        
        double rand_dbl=r.nextDouble();
        System.out.println(rand_dbl);
        
        System.out.println(rnumber);
        
        
    }
}
