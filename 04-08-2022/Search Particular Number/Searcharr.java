import java.util.Scanner;
class Searcharr
{
	public static void main(String arg[])
	{
		int n=0, no;
		int a[]= new int[5];
		System.out.println("Enter Any 5 Numbers:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter Number For Search:");
		no = s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				n=1;
			}
		}
		if(n==1)
		{
			System.out.println("\nNumber is Present in array.");
		}
		else
		{
			System.out.println("\nNumber is not Present in array.");
		}
	}
}