import java.util.Scanner;
class Ascending
{
	public static void main(String arg[])
	{
		int a[]= new int[5];
		System.out.println("Enter Any 5 Numbers:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int no=a[i];
					a[i]=a[j];
					a[j]=no;
				}
			}
		}
		System.out.println("\nNumber in Ascending order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}