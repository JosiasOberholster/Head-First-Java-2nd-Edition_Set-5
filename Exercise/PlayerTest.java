package Exercise;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayerTest
{
	public static StringBuffer name;
	public String playerName;
	public String question;
	
	public static void main(String[ ]args)
	{
		new PlayerTest().thePlayer();
	}
	
	public void thePlayer()
	{
		String playerName = null;
		String question = null;
		
		StringBuffer buffer = new StringBuffer();
		BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Insert player name:");
		
		try
		{
			playerName = nameReader.readLine();
			buffer.append(playerName);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("\nPlayer name is: " + buffer);
		
		BufferedReader nameReady = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Is that Correct? [Yes/No]");
		
		try
		{
			question = nameReady.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		if(question.equalsIgnoreCase("yes"))
		{
			System.out.println("\nWelcome " + buffer);
			name = buffer;
			new PlayerTestTest().Test();
		}
		else if(question.equalsIgnoreCase("no"))
		{
			buffer.delete(0, buffer.length());
			thePlayer();
		}
		else
		{
			System.out.println("\nReply with a yes or no");
			buffer.delete(0, buffer.length());
			thePlayer();
		}
		
		
		
	}
}
