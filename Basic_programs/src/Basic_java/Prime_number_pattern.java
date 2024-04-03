package Basic_java;



import java.io.*;
import java.util.*;


class Prime
{
   
Scanner s= new Scanner(System.in);
    void checkPrime(int n)
    {
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        for(int j=0;j<arr.length;j++)
        {
            for(int k=2;k<arr.length;k++)
            {
                int count=0;
                if(arr[j]%k==0)
                {
                    count++;
                }
                if(count<=0)
                {
                    System.out.print(arr[j]);
                }
            }
            System.out.println("");
            
          
            
        }
        
        
        
    }
}
public class Prime_number_pattern {

    public static void main(String[] args) {
        
        Prime obj =new Prime();
        
        obj.checkPrime(5);
  
    }
}