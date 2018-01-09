package Chapter16;

import java.util.*;

public class TestMap
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> score = new HashMap<String, Integer>();
		
		score.put("Skyler", 420);
		score.put("Bert", 343);
		score.put("Kathy", 42);
		
		System.out.println(score);
		System.out.println("Bert's score is: " + score.get("Bert"));
	}
}