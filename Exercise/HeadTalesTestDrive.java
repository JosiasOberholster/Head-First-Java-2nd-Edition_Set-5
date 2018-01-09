package Exercise;
public class HeadTalesTestDrive
{
	public static void main(String[] args)
	{
		String[] side = {"heads", "Tales"};
		
		int chance = side.length;
		
		int rand = (int)(Math.random() * chance);
		
		String going = side[rand];
		
		HeadTales.flip(going);
	}
}