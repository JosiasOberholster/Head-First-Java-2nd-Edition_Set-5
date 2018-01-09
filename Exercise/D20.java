package Exercise;
public class D20
{
	public static void main(String[] args)
	{
		int x = (int)(Math.random() * 21);
		
		int numb = x;
		
		if(numb == 1)
		{
			System.out.println(numb + ": Crit Fail!");
		}
		else if(numb == 20)
		{
			System.out.println(numb + ": Crit Hit!");
		}
		else if(numb > 16)
		{
			System.out.println(numb + ": Hit!");
		}
		else
		{
			System.out.println(numb + ": fail!");
		}
		
	}
}