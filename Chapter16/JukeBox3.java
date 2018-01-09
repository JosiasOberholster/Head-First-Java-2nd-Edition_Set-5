package Chapter16;

import java.util.*;
import java.io.*;

public class JukeBox3
{
    ArrayList<Song3> songList = new ArrayList<Song3>();
    
    public static void main(String[] args) 
    {
        new JukeBox3().go();
    }
    
    public void go() 
    {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    
    void getSongs()
    {
        try 
        {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            String line = null;
           
            while ((line = reader.readLine()) != null) 
            {
                addSong(line);
            }
        } catch (Exception ex) 
        { 
        	ex.printStackTrace(); 
        }
    }
    
    void addSong(String lineToParse) 
    {
        String[] tokens = lineToParse.split("/");
        Song3 nextSong = new Song3(tokens[0], tokens[1]);
        songList.add(nextSong);
    }
}
