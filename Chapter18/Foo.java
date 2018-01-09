package Chapter18;
public class Foo 
{
	public void go()
	{
		Bar b = new Bar();
		b.doStuff();
	}
	
	public static void main(String[] args)
	{
		Foo f = new Foo();
		f.go();
	}
	
	public class Bar
	{
		public void doStuff()
		{
			System.out.println("Stuff is being done on both Foo and Bar");
		}
	}
}
