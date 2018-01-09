package Chapter18;
public class PhraseOMatic 
{
	public static String makePhrase()
	{
		String[] wordList1 = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-base", "pervasive",
				   "smart", "six-segma", "critical-path", "dynamic"};

		String[] wordList2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distrubuted", "cluster", "branded",
	              "outside-the-box", "positioned", "networked", "focused", "leverage", "aligned", "targeted", 
	              "shared", "coopretive", "accelerate"};

		String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare",
	              "portal", "space", "vision", "paradigm", "mission"};
		
		int oneLength = wordList1.length;
		int twoLength = wordList2.length;
		int threeLength = wordList3.length;
		
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		String phrase = wordList1[rand1] + " " + wordList2[rand2] + "" + wordList3[rand3];
		
		return("What we need is a " + phrase);
	}
}
