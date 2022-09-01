import java.util.stream.LongStream;
public class FactorialNo
{
    public static long fact(long n) 
    {
        return LongStream.rangeClosed(2, n).reduce(1, (long x, long y) -> x * y);
    }
    public static void main(String []args)
    {
        long  n = 5 ;   
        long result;  
        result  = fact(n);
        System.out.println("Using Lambda Expression....");
        System.out.println("The Factorial of "+ n +" is " + result); 
     }
}
