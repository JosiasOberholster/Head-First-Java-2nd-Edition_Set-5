package Chapter16;

public class Song3 implements Comparable<Song3>
{
	String title;
	String artist;
	
	public int compareTo(Song3 s)
	{
		return title.compareTo(s.getTitle());
	}
	
	Song3(String t, String a)
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
