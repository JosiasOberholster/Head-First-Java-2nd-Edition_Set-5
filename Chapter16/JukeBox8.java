package Chapter16;

import java.util.*;
import java.io.*;

public class JukeBox8
{
	ArrayList<Song8> songList = new ArrayList<Song8>();
	
	public static void main(String[] args)
	{
		new JukeBox8().go();
	}
	
	public void go()
	{
		getSongs();
		
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		TreeSet<Song8> songSet = new TreeSet<Song8>();
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
		Song8 nextSong = new Song8(token[0], token[1]);
		System.out.println(nextSong);
	}
}