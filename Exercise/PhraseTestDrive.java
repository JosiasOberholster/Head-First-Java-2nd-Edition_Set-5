package Exercise;
public class PhraseTestDrive
{
	public static void main(String[] args)
	{
		String[] wordListOne = {"Graphic" , "Anxious", "Repeat", "Passanger", "Emperor",
				                "Absently" , "Wise", "Shameful", "FistFight", "Behold"};

		String[] worlistTwo = {"Bleeder", "Plaid", "melody", "Mad", "Weapon", 
				               "Federation", "Flood", "Cows", "Blaster", "Furry"};
		
		String[] wordListThree = {"Magic", "Dismember", "Champion", "Continuous", "Chameleon",
				                  "Bomb", "Delete", "Lullaby", "Hogtied", "Cave"};
		
		int lengthOne = wordListOne.length;
		int lengthTwo = worlistTwo.length;
		int lengthThree = wordListThree.length;
		
		int randOne = (int)(Math.random() * lengthOne);
		int randTwo = (int)(Math.random() * lengthTwo);
		int randThree = (int)(Math.random() * lengthThree);
		
		String phraseOne = wordListOne[randOne];
		String phraseTwo = worlistTwo[randTwo];
		String phraseThree = wordListThree[randThree];
		
		Phrase.run(phraseOne);
		Phrase.run(phraseTwo);
		Phrase.run(phraseThree);
	}
}