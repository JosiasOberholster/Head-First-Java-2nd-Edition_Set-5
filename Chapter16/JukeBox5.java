package Chapter16;

import java.util.*;
import java.io.*;

public class JukeBox5 
{
	ArrayList<Song5> songList = new ArrayList<Song5>();
	
	public static void main(String[] args)
	{
		new JukeBox5().go();
	}
	
	class ArtistCompare implements Comparator<Song5>
	{
		public int compare(Song5 one, Song5 two)
		{
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	public void go()
	{
		getSongs();
		
		System.out.println(songList);
		
		Collections.sort(songList);
		
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		
		System.out.println(songList);
	}
	
	void getSongs()
	{
		try
		{
			File file = new File("SongList.txt");
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
		
		Song5 nextSong = new Song5(token[0], token[1]);
		
		songList.add(nextSong);
	}
}