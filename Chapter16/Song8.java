package Chapter16;

public class Song8 implements Comparable<Song8>
{
	String title;
	String artist;
	
	public boolean equals(Object aSong)
	{
		Song8 s = (Song8) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode()
	{
		return title.hashCode();
	}
	
	public int compareTo(Song8 s)
	{
		return title.compareTo(s.getTitle());
	}
	
	Song8(String t, String a)
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
