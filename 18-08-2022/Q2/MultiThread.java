class prime extends Thread 
{
    public synchronized void run()
    {
        String primeNumbers = "";
        for (int i=1; i<=100; i++) 
        {
            int count = 0;
            for (int n=i; n>=1; n--) 
            {
                if (i%n==0) 
                {
                    count+= 1;
                }
            }
            if (count==2) 
            {
                primeNumbers=primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 0 to 100 : \n" + primeNumbers);
        System.out.println("-------------------------------------------");
    }
}
class table extends Thread 
{
    public synchronized void run()
    {
        int n=11;
        System.out.println("Multiplication Table of 11:");
        for (int i=1; i<=10; i++) 
        {
            int s=n*i;
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
        System.out.println("Sequence of 3:");
    }
}
class seq extends Thread
{
    public synchronized void run()
    {
        int n,no=3;
        for(n=1;n<10;n++)
        {
            no*=n;
            System.out.println("Thread 3: Sequence "+no);
        }
        System.out.println("-------------------------------------------");
    }
}
public class MultiThread
{
    public static void main(String args[])
    {
        table t1 = new table();
        seq t2 = new seq();
        prime t3 = new prime();
 
        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t2);
        Thread m3 = new Thread(t3);
        
        m1.start();
        m2.start();
        m3.start();
        try 
        {
            m1.join();
            m2.join();
            m3.join();
        }
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
