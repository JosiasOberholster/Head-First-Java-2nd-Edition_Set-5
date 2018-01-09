package Exercise;
public class Fetch 
{
	private int amount;
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setAmount(int a)
	{
		amount = a;
	}
	
	void ball()
	{
		int ballThrow = amount;
		while(amount > 0)
		{
			System.out.println("Ball was thrown");
			System.out.println("Ball was fetched");
			amount--;
		}
		System.out.println("");
		System.out.println("Ball was thrown : " + ballThrow);
		System.out.println("Ball was throwned : " + ballThrow);
	}
}
