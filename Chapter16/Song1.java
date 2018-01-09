package Chapter16;

public class Song1 implements Comparable<Song1>
{
	String title;
	String artist;
	
	public int compareTo(Song1 s)
	{
		return title.compareTo(s.getTitle());
	}
	
	Song1(String t, String a)
	{
		title = t;
		artist = a;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String toString()
	{
		return title;
	}
}
