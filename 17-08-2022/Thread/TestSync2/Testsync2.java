class table
{
	synchronized void printtable(int n)
	{
		for(int i=3;i<=9;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Testsync2
{
	public static void main(String arg[])
	{
		final table t = new table();
		Thread t1 = new Thread()
		{
			public void run()
			{
				t.printtable(5);
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				t.printtable(100);
			}
		};
		t1.start();
		t2.start();
	}
}