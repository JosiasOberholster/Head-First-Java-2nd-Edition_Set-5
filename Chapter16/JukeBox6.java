package Chapter16;

import java.util.*;
import java.io.*;

public class JukeBox6 
{
	ArrayList<Song6> songList = new ArrayList<Song6>();
	
	public static void main(String[] args)
	{
		new JukeBox6().go();
	}
	
	public void go()
	{
		getSongs();
		
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		HashSet<Song6> songSet = new HashSet<Song6>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
	
	void getSongs()
	{
		try
		{
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			
			while((line = reader.readLine()) != null)
			{
				addSong(line);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	void addSong(String lineToParse)
	{
		String[] token = lineToParse.split("/");
		Song6 nextSong = new Song6(token[0], token[1]);
		System.out.println(nextSong);
	}
}