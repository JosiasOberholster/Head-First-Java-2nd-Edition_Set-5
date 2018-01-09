package Chapter16;

import java.io.*;

public class SongListMore 
{
	public static void main(String[] args)
	{
		new SongListMore().songlist();
	}
	
	public void songlist()
	{
		try
		{
			FileWriter writer = new FileWriter("SongListMore.txt");
			
			writer.write("Pink Moon/Nick Drake/5/80 \n Somersault/Zero 7/4/84 \n Shiva Moon/Prem Joshua/6/120 \n"
						+ "Circles/BT/5/110 \n Deep Channel/Afro Celts/4/120 \n Passenger/Headmix/4/100 \n"
						+ "Listen/Tahiti 80/5/90 \n Listen/Tahiti 80/5/90 \n Listen/Tahiti 80/5/90 \n Circles/BT/5/110");
			
			writer.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
