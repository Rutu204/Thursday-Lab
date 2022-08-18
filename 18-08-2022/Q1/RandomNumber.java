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
        System.out.println("The Thread " + x + " is EVEN and Square of " + x + " is : " + sqr );
    }
}
class Cube extends Thread
{
    int y;
    Cube(int a)
    {
        this.y = a;
    }
    public void run()
    {
        int cub = y * y * y;
        System.out.println("The Thread " + y + " is ODD and Cube of " + y + " is : " + cub );
    }
}
class Num extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i=0;i<6; i++)
        {
            int randInt = random.nextInt(80);  
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