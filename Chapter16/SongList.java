package Chapter16;

import java.io.*;

public class SongList 
{
	public static void main(String[] args)
	{
		new SongList().getList();
	}
	
	public void getList()
	{
		try
		{
			FileWriter writer = new FileWriter("SongList.txt");
			
			writer.write("Pink Moon/Nick Drake \nSomersault/Zero 7 \nShiva Moon/Prem Joshua \nCircle/BT"
					    + " \nDeep Channel/Afro Celts \nPassenger/Headmix \nListen/Tahiti 80");
			
			writer.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
