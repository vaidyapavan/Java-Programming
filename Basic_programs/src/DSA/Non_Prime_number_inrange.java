package DSA;

public class Non_Prime_number_inrange {

    public static void main(String[] args) {
        int count1=0;
        int count=0;

        for (int i = 2; i <= 100; i++) { // Start from 2, as 0 and 1 are not prime numbers
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
            	 count=0;
                if (i % j == 0) {
                    count++;
                    break; // If i is divisible by j, it's not a prime number, so break the loop
                }
            }

            if (count>0) {
                count1++;
            }
        }

        System.out.println("Total no of non  prime numbers are:" + count1);
    }
}
