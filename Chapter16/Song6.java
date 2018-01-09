package Chapter16;

class Song6 implements Comparable<Song6>
{
	String title;
	String artist;
	
	public boolean equals(Object aSong)
	{
		Song6 s = (Song6) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode()
	{
		return title.hashCode();
	}
	
	public int compareTo(Song6 s)
	{
		return title.compareTo(s.getTitle());
	}
	
	Song6(String t, String a)
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
