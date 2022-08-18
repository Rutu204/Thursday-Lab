import java.util.Random;
class Square extends Thread
{
    int x;
    Square(int a)
    {
        this.x = a;
    }
    public void run()
    {
        int sqr = x * x;
        System.out.println("Thre Thread " + x + " is EVEN and Square of " + x + " is : " + sqr );
    }
}
class Cube extends Thread
{
    int x;
    Cube(int a)
    {
        this.x = a;
    }
    public void run()
    {
        int cub = x * x * x;
        System.out.println("The Thread " + x + " is ODD and Cube of " + x + " is : " + cub );
    }
}
class Num extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i=1;i<=5; i++)
        {
            int randInt = random.nextInt(100);  
            System.out.println("Generated Number is : " + randInt);
            if(randInt%2==0)
            {
                Square s = new Square(randInt);
                s.start();
            }
            else
            {
                Cube c = new Cube(randInt);
                c.start();
            }
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
public class RandomNumber 
{
    public static void main(String args[])
    {
        Num a = new Num();
        a.start();
    }
}