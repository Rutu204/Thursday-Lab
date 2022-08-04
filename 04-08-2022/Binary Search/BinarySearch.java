import java.util.Scanner;
class BinarySearch
{
	public static void binarySearch(int first, int last,int a[], int key)
	{
		int mid = (first+last)/2;
		while(first<=last)
		{
			if(a[mid]<key)
			{
				
				first = mid+1;
			}
			else if(a[mid]==key)	
			{
				System.out.println("\nNumber is found at index: " + mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last )
		{
			System.out.println("\nNumber is not found!");
		}
	}
	public static void main(String args[])
	{
		int a[]= new int[5];
		System.out.println("Enter Any 5 Numbers:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("\nEnter any Number of Search:");
		int key= s.nextInt();
		int last=a.length-1;
		int first=0;
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
		binarySearch(first,last,a,key);
	}
}