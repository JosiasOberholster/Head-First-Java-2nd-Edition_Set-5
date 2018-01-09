package Chapter16;

public class Song5 implements Comparable<Song5>
{
	String title;
	String artist;
	
	public int compareTo(Song5 s)
	{
		return title.compareTo(s.getTitle());
	}
	
	Song5(String t, String a)
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
