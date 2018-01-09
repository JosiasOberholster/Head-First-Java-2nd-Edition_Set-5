package Exercise;
public class ReturnMethod
{
	private void count(int x , int y, int z)
	{
		z = x + y;
		System.out.println(x + " + " + y + " " + z);
	}
	
	public static int getCountA(int a)
	{
		return a;
	}
	
	public static int getCountB(int b)
	{
		return b;
	}
	
	public static int getCountC(int c)
	{
		return c;
	}
	
	private void setCountA(int a)
	{
		int x = a;
	}
}