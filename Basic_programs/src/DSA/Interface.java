package DSA;

import java.io.*;
import java.util.*;

public class Interface
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyCalculator calculator = new MyCalculator();
         int result=calculator.divisor_sum(n);
         System.out.println(result);
         
    }
}
interface AdvancedArithmetic
{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
    MyCalculator()
    {
        System.out.println("I implemented: "+getClass().getInterfaces()[0].getName());
    }
    @Override
    public int divisor_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n ;i++)
        {
            if(n % i ==0) sum +=i;
            
        }
        return sum;
    }
}